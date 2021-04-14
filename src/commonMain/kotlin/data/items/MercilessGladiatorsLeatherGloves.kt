package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class MercilessGladiatorsLeatherGloves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31998

  public override var name: String = "Merciless Gladiator's Leather Gloves"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_28.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(577)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.ROGUE
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 31,
      stamina = 45,
      armor = 268,
      meleeCritRating = 16.0,
      rangedCritRating = 16.0,
      resilienceRating = 24.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15806, "Attack Power 34", this),
        Buffs.byIdOrName(32748, "Deadly Throw Interrupt", this)
        )}

}
