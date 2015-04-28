package solutions

import org.specs2.mutable.Specification
import solutions.Problem01To10._


/**
 * Created by bridge on 26/04/15.
 */

class Problem01To10Spec extends Specification {

  "Problem 1 Should sum the factors" >> {
    Problem01(1000) must_==(233168)
  }

  "Problem 2 Should sum the even fibonacci terms" >> {
    Problem02(4000000) must_==(4613732)
  }

  "Problem 3 Should largest prime factor" >> {
    Problem03(600851475143l) must_==(6857)
  }

  "Problem 4 Should find the largest palindrome" >> {
    Problem04() must_==(906609)
  }

  "Problem 5 is evenly divisible by 1-20" >> {
    Problem05(20l) must_==(232792560)
  }

//  "Problem 6 Should sum the factors" >> {
//    Problem03(4000000) must_==(25164150)
//  }


}