package character.classes.shaman

import character.*
import character.classes.shaman.talents.*

class Shaman(talents: Map<String, Talent>) : Class(talents) {
    override fun talentFromString(name: String, ranks: Int): Talent? {
        return when(name.trim()) {
            AncestralKnowledge.name -> AncestralKnowledge(ranks)
            Concussion.name -> Concussion(ranks)
            Convection.name -> Convection(ranks)
            DualWield.name -> DualWield(ranks)
            DualWieldSpecialization.name -> DualWieldSpecialization(ranks)
            ElementalDevastation.name -> ElementalDevastation(ranks)
            ElementalWeapons.name -> ElementalWeapons(ranks)
            EnhancingTotems.name -> EnhancingTotems(ranks)
            Flurry.name -> Flurry(ranks)
            ImprovedWeaponTotems.name -> ImprovedWeaponTotems(ranks)
            MentalQuickness.name -> MentalQuickness(ranks)
            NaturesGuidance.name -> NaturesGuidance(ranks)
            Reverberation.name -> Reverberation(ranks)
            ShamanisticFocus.name -> ShamanisticFocus(ranks)
            ShamanisticRage.name -> ShamanisticRage(ranks)
            Stormstrike.name -> Stormstrike(ranks)
            ThunderingStrikes.name -> ThunderingStrikes(ranks)
            TotemicFocus.name -> TotemicFocus(ranks)
            UnleashedRage.name -> UnleashedRage(ranks)
            WeaponMastery.name -> WeaponMastery(ranks)
            else -> null
        }
    }

    override var baseStats: Stats = Stats(
        agility = 222,
        intellect = 180,
        strength = 108,
        stamina = 154,
        spirit = 135
    )

    override val abilities: List<Ability> = listOf()
    override val buffs: List<Buff> = listOf()
    override val procs: List<Proc> = listOf()

    override val resourceType: Resource.Type = Resource.Type.MANA
    override val baseResourceAmount: Int = 0

    override val canDualWield: Boolean
        get() = talents["Dual Wield"]?.currentRank == 1

    override val allowAutoAttack: Boolean = true

    override val attackPowerFromAgility: Int = 0
    override val attackPowerFromStrength: Int = 2
    override val critPctPerAgility: Double = 0.0 //1.0/25.0
    override val rangedAttackPowerFromAgility: Int = 1
}
