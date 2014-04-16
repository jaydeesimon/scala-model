import java.awt.Dimension
import scala.swing._

object MainApp extends SimpleSwingApplication {

  override def top: Frame = new MainFrame {
    preferredSize = new Dimension(Playfield.StandardSize.width, Playfield.StandardSize.height + 6)
    contents = new Playfield
    centerOnScreen()
  }
}