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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class ExorcistsLamellarHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Exorcist's Lamellar Helm"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      intellect = 16,
      spellCritRating = 16.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3204)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(13881)
      )
}
