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
public class WrathfireHandCannon : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27898

  public override var name: String = "Wrathfire Hand-Cannon"

  public override var itemLevel: Int = 112

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_rifle_20.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 90.0

  public override var maxDmg: Double = 168.0

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      meleeCritRating = 10.0,
      rangedCritRating = 10.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9336, "Attack Power 30", this)
        )}

}
