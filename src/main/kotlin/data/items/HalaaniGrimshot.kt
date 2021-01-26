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

public class HalaaniGrimshot : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Halaani Grimshot"

  public override var itemLevel: Int = 107

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.PROJECTILE

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BULLET

  public override var minDmg: Double = 34.0

  public override var maxDmg: Double = 34.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
