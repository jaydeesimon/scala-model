import java.awt.{Color, Dimension}
import scala.swing.Panel

class Playfield(width: Int = 10, height: Int = 22) extends Panel {
  preferredSize = Playfield.StandardSize
  val cellWidth = Playfield.StandardSize.width / width
  val cellHeight = Playfield.StandardSize.height / height

  override protected def paintComponent(g: swing.Graphics2D): Unit = {
    super.paintComponent(g)

    for (c <- 0 until width)
      for (r <- 0 until height)
        g.drawRect(c * cellWidth, r * cellHeight, cellWidth, cellHeight)

    fillIn(g, 4, 10)
  }

  def fillIn(g: swing.Graphics2D, c: Int, r: Int) = {
    g.setBackground(Color.BLACK)
    g.fillRect(c * cellWidth, r * cellHeight, cellWidth, cellHeight)
  }
}

object Playfield {
  val StandardSize = new Dimension(230, 520)
}
