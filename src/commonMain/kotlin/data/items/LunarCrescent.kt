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
public class LunarCrescent : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28434

  public override var name: String = "Lunar Crescent"

  public override var itemLevel: Int = 107

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_50.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 324.0

  public override var maxDmg: Double = 487.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      meleeCritRating = 47.0,
      rangedCritRating = 47.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33485, "Attack Power 96", this)
        )}

}
