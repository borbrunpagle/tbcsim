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
public class ShurikenOfNegation : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28826

  public override var name: String = "Shuriken of Negation"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_misc_ahnqirajtrinket_03.jpg"

  public override var inventorySlot: Int = 25

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.THROWN

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 79.0

  public override var maxDmg: Double = 120.0

  public override var speed: Double = 1200.0

  public override var stats: Stats = Stats(
      stamina = 19
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15809, "Attack Power 42", this)
        )}

}
