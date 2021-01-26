package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class CeremonialWarmaulBloodblade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Ceremonial Warmaul Blood-blade"

  public override var itemLevel: Int = 103

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 74.0

  public override var maxDmg: Double = 139.0

  public override var speed: Double = 1700.0

  public override var stats: Stats = Stats(
      agility = 13,
      stamina = 19
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(9334)
      )
}
