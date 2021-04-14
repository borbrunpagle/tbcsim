package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class CursedVisionOfSargeras : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32235

  public override var name: String = "Cursed Vision of Sargeras"

  public override var itemLevel: Int = 151

  public override var quality: Int = 4

  public override var icon: String = "inv_misc_bandana_03.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 39,
      stamina = 46,
      armor = 385,
      meleeCritRating = 38.0,
      rangedCritRating = 38.0,
      physicalHitRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2868)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33782, "Attack Power 108", this),
        Buffs.byIdOrName(47524, "Sense Demons", this)
        )}

}
