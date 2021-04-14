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
public class AxeOfTheNexusKings : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27829

  public override var name: String = "Axe of the Nexus-Kings"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_axe_70.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 253.0

  public override var maxDmg: Double = 381.0

  public override var speed: Double = 3400.0

  public override var stats: Stats = Stats(
      stamina = 33,
      meleeCritRating = 35.0,
      rangedCritRating = 35.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15821, "Attack Power 72", this)
        )}

}
