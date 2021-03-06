package common
import scala.io.{BufferedSource, Source}

object BookCollection extends DocumentCollection {
  def getPaths : Seq[String] =
    (1 to 10).map("book" + _ + ".txt")

  override def getSource(path: String): BufferedSource =
    Source.fromResource(path)
}
