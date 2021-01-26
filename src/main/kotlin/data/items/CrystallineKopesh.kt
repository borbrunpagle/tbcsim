package `data`.items

import `data`.Constants
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class CrystallineKopesh : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Crystalline Kopesh"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 88.0

  public override var maxDmg: Double = 165.0

  public override var speed: Double = 2100.0

  public override var stats: Stats = Stats(
      stamina = 18,
      physicalHitRating = 13.0,
      spellHitRating = 13.0,
      defenseRating = 12.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
