/**
  * Created by User on 15.05.2016.
  */

import org.scalatest._

class Codeforces471ASpec extends FlatSpec with Matchers {

  "Codeforces471A" should "return Bear" in {
    Codeforces471A.process(Array(4, 2, 5, 4, 4, 4)) should be("Bear")
  }


  "Codeforces471A" should "return Elephant" in {
    Codeforces471A.process(Array(4, 4, 5, 4, 4, 5)) should be("Elephant")
    Codeforces471A.process(Array(4, 4, 4, 4, 4, 4)) should be("Elephant")
  }

  "Codeforces471A" should "return Alien" in {
    Codeforces471A.process(Array(1, 2, 3, 4, 5, 6)) should be("Alien")
  }


}
