package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class GrandMarshalsPlateChestpiece : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28699

  public override var name: String = "Grand Marshal's Plate Chestpiece"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_plate05.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = ItemSets.byId(590)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 12,
      stamina = 46,
      armor = 1164,
      meleeCritRating = 24.0,
      rangedCritRating = 24.0,
      resilienceRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2874)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
