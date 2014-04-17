package com.jds.tetris

import scala.swing.{MainFrame, Frame, SimpleSwingApplication}
import java.awt.Dimension
import Playfield._

object MainApp extends SimpleSwingApplication {

  override def top: Frame = new MainFrame {
    preferredSize = new Dimension(StandardSize.width, StandardSize.height + 6)
    contents = new Playfield
    centerOnScreen()
  }
}
