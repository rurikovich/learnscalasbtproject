/**
  * Created by User on 15.05.2016.
  */
object Codeforces471A {

  def main(args: Array[String]) {
    val l = readLine.split(" ").map(_.toInt)
    process(l)
  }

  def process(blocks: Array[Int]): String = {
    var result = "Alien"


    val sBlocks = blocks.sortWith(_ < _)

    if (sBlocks(0) == sBlocks(1) == sBlocks(2)) {}
    ""

  }
}
