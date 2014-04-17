package com.jds.tetris

import java.awt.{Color, Dimension}
import scala.swing.event.{Key, KeyPressed}
import scala.swing.Panel
import Playfield._

class Playfield(width: Int = 10, height: Int = 22) extends Panel {
  preferredSize = StandardSize
  val cellWidth = StandardSize.width / width
  val cellHeight = StandardSize.height / height

  val tetrominoes: Set[Tetromino] = Set(new ZBlock())

  focusable = true
  listenTo(keys)

//  reactions += {
//    case KeyPressed(_, Key.Up, _, _) => { y -= 1; repaint() }
//    case KeyPressed(_, Key.Down, _, _) => { y += 1; repaint() }
//    case KeyPressed(_, Key.Left, _, _) => { x -= 1; repaint() }
//    case KeyPressed(_, Key.Right, _, _) => { x += 1; repaint() }
//  }

  def drawTetromino(g: swing.Graphics2D, c: Int, r: Int, tetromino: Tetromino) = {
    val startX = c * cellWidth
    val startY = r * cellHeight

    for (bx <- 0 until 4)
      for (by <- 0 until 4) {
        if (tetromino.isActiveBlocklet(bx, by))
          fillIn(g, startX + bx, startY + by)
      }
  }

  def drawTetrominoes(g: swing.Graphics2D): Unit = {
    for (tetromino <- tetrominoes)
      drawTetromino(g, 0, 0, tetromino)
  }

  override protected def paintComponent(g: swing.Graphics2D): Unit = {
    super.paintComponent(g)

    g.setColor(new Color(238, 238, 238))
    for (c <- 0 until width)
      for (r <- 0 until height)
        g.drawRect(c * cellWidth, r * cellHeight, cellWidth, cellHeight)

    drawTetrominoes(g)
  }

  def fillIn(g: swing.Graphics2D, c: Int, r: Int) = {
    g.setColor(Color.BLACK)
    g.fillRect(c * cellWidth, r * cellHeight, cellWidth, cellHeight)
  }
}

object Playfield {
  val StandardSize = new Dimension(230, 520)
}