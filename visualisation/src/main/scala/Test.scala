import org.scalajs.dom
import dom.document

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExportTopLevel

/**
  * Created by artsiom.chuiko on 05/05/2017.
  */
object Test extends JSApp {
  override def main(): Unit = appendPar(document.body, "Hello World")

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}
