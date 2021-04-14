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
public class GrandMarshalsMaul : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28948

  public override var name: String = "Grand Marshal's Maul"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_hammer_04.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 158.9199981689453

  public override var maxDmg: Double = 293.9200134277344

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 28,
      stamina = 42,
      meleeCritRating = 28.0,
      rangedCritRating = 28.0,
      physicalHitRating = 18.0,
      resilienceRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44908, "Attack Power - Feral (+0539)", this)
        )}

}
