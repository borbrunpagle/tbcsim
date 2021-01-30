package character.classes.shaman.abilities

import character.Ability
import character.Proc
import character.classes.shaman.talents.ElementalWeapons
import data.Constants
import data.model.Item
import mechanics.Spell
import sim.Event
import sim.SimIteration

class FlametongueWeapon(override val name: String, val item: Item) : Ability() {
    companion object {
        const val name = "Flametongue Weapon"
    }

    override val id: Int = 25489

    override fun available(sim: SimIteration): Boolean {
        return if(isOffHand(sim)) { sim.isDualWielding() } else true
    }

    fun isOffHand(sim: SimIteration): Boolean {
        return item === sim.subject.gear.offHand
    }

    // Per internet anedcodes, this gets 10% of spell power
    val spCoeff = 0.10
    val baseDamage = 40.35
    override fun cast(sim: SimIteration, free: Boolean) {
        val elementalWeapons = sim.subject.klass.talents[ElementalWeapons.name] as ElementalWeapons?
        val mod = elementalWeapons?.flametongueDamageMultiplier() ?: 1.0

        val school = Constants.DamageType.FIRE
        // TODO: Weapo speed scaling mechanics unconfirmed
        //       Ancient source: http://urbad.net/blue/eu/394130313-TBC_Enhancement_Shaman_FAQ
        val speedBasedDamage = baseDamage * item.speed / 1000.0 * mod
        val damageRoll = Spell.baseDamageRoll(sim, speedBasedDamage, spCoeff, school)
        val result = Spell.attackRoll(sim, damageRoll, school)

        sim.logEvent(Event(
            eventType = Event.Type.DAMAGE,
            damageType = school,
            abilityName = name,
            amount = result.first,
            result = result.second,
        ))

        // Proc anything that can proc off Nature damage
        val triggerTypes = when(result.second) {
            Event.Result.HIT -> listOf(Proc.Trigger.FIRE_DAMAGE)
            Event.Result.CRIT -> listOf(Proc.Trigger.FIRE_DAMAGE)
            Event.Result.PARTIAL_RESIST_HIT -> listOf(Proc.Trigger.FIRE_DAMAGE)
            Event.Result.PARTIAL_RESIST_CRIT -> listOf(Proc.Trigger.FIRE_DAMAGE)
            else -> null
        }

        if(triggerTypes != null) {
            sim.fireProc(triggerTypes, listOf(), this)
        }
    }

    override val baseCastTimeMs: Int = 0
    override fun gcdMs(sim: SimIteration): Int = 0
}