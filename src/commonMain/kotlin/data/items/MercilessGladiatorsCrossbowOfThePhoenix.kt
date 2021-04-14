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
public class MercilessGladiatorsCrossbowOfThePhoenix : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31986

  public override var name: String = "Merciless Gladiator's Crossbow of the Phoenix"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_crossbow_10.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CROSSBOW

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 211.0

  public override var maxDmg: Double = 318.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(
      stamina = 21,
      meleeCritRating = 15.0,
      rangedCritRating = 15.0,
      resilienceRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(21436, "Attack Power Ranged 26", this)
        )}

}
