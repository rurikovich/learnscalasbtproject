/**
  * Created by User on 15.05.2016.
  */

import org.scalatest._

class Codeforces454BSpec extends FlatSpec with Matchers {

  "Codeforces454B" should "can sort" in {
    Codeforces454B.process(2, Array(2, 1)) should be(1)
    Codeforces454B.process(2, Array(1, 2)) should be(0)
  }


  "Codeforces454B" should "can not sort" in {
    Codeforces454B.process(3, Array(1, 3, 2)) should be(-1)
  }


}
