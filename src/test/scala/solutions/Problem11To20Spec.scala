package solutions

import org.specs2.mutable.Specification
import solutions.Problem11To20._

/**
 * Created by bridge on 30/04/15.
 */
class Problem11To20Spec  extends Specification {

  "Problem 11 The maximum product of four adjacent numbers" >> {
    Problem11 must_==(70600674)
  }

  "Problem 12 The triangle number with over 500 divisors" >> {
    Problem12 must_==(76576500)
  }

  "Problem 13 The first ten digits" >> {
    Problem13 must_==(5537376230)
  }

  //14. 837799
  //15. 137846528820
  //16. 1366
  //17. 21124
  //18. 1074
  //19. 171
  //20. 648

}
