package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class VengefulGladiatorsDecapitator : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33670

  public override var name: String = "Vengeful Gladiator's Decapitator"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_60.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 386.0

  public override var maxDmg: Double = 580.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      stamina = 62,
      meleeCritRating = 46.0,
      rangedCritRating = 46.0,
      physicalHitRating = 15.0,
      resilienceRating = 33.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15832, "Attack Power 92", this),
        Buffs.byIdOrName(43902, "Armor Penetration 98", this)
        )}

}
