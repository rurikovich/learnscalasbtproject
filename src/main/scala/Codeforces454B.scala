/**
  * Created by User on 15.05.2016.
  */
object Codeforces454B {

  def main(args: Array[String]) {
    val n = readInt()
    val l = readLine.split(" ").map(_.toInt)
    println(process(n, l))
  }

  def process(n: Int, ints: Array[Int]): Int = {
    val doubleArr = ints ++ ints

    var res = -1
    for ((arr, i) <- doubleArr.sliding(n).toList.view.zipWithIndex) {

      if (arr.sliding(2).forall(cn => cn(0) <= cn(1))) {
        res = i
      }
    }
    res
  }
}
