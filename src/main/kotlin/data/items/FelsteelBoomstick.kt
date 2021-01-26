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

public class FelsteelBoomstick : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Felsteel Boomstick"

  public override var itemLevel: Int = 108

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 104.0

  public override var maxDmg: Double = 194.0

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      stamina = 12,
      physicalCritRating = 13.0,
      spellCritRating = 13.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
