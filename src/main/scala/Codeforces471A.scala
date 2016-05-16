/**
  * Created by User on 15.05.2016.
  */
object Codeforces471A {

  def main(args: Array[String]) {
    val l = readLine.split(" ").map(_.toInt)
    println(process(l))
  }

  def process(blocks: Array[Int]): String = {
    var result = "Alien"
    val sBlocks = blocks.sortWith(_ < _)

    val listGroupedBy4 = sBlocks.sliding(4).map((sl: Array[Int]) => sl.forall(s => s == sl(0))).toList

    if (listGroupedBy4.contains(true)) {
      val by0: Boolean = listGroupedBy4(0)
      val by1: Boolean = listGroupedBy4(1)
      val by2: Boolean = listGroupedBy4(2)
      if (by1 && !by0 && !by2 || by0 && sBlocks(4) != sBlocks(5) || by2 && sBlocks(0) != sBlocks(1)) {
        result = "Bear"
      } else {
        result = "Elephant"
      }
    }
    result

  }
}
