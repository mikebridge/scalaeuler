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
    Problem13 must_==("5537376230")
  }

  "Problem 14 The sequence start position" >> {
    Problem14 must_==(837799)
  }

  "Problem 15 The longest path" >> {
    Problem15 must_==(137846528820L)
  }

  "Problem 16 The sum of the digits of 2 to 1000" >> {
    Problem16 must_==(1366)
  }

  "Problem 17 The total letters of the numbers 1-1000" >> {
    Problem17 must_==(21124)
  }

  "Problem 18 The maximum sum by following paths is" >> {
    Problem18 must_==(1074)
  }
  //18. 1074
  //19. 171
  //20. 648

}
