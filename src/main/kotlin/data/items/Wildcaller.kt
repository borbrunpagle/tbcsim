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

public class Wildcaller : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Wildcaller"

  public override var itemLevel: Int = 109

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 122.76000213623047

  public override var maxDmg: Double = 221.75999450683594

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      strength = 45,
      agility = 24,
      expertiseRating = 20.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(44906)
      )
}
