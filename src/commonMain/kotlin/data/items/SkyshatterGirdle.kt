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
public class SkyshatterGirdle : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34545

  public override var name: String = "Skyshatter Girdle"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_belt_13.jpg"

  public override var inventorySlot: Int = 6

  public override var itemSet: ItemSet? = ItemSets.byId(682)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.SHAMAN
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 43,
      intellect = 15,
      armor = 605,
      meleeCritRating = 28.0,
      rangedCritRating = 28.0,
      physicalHasteRating = 29.0,
      expertiseRating = 22.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2857)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
