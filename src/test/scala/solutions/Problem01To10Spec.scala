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

  "Problem 6 should find difference" >> {
    Problem06(100) must_==(25164150)
  }

  "Problem 7 should find the 10001th prime" >> {
    Problem07(10001) must_==(104743)
  }

  "Problem 8 should find the largest product of adjacent numbers" >> {
    Problem08() must_==(23514624000L)
  }

  "Problem 9 should find the pythagorean triplet" >> {
    Problem09() must_== 31875000
  }

  "Problem 10 should sum the primes below 2 million" >> {
    Problem10() must_== 142913828922L
  }
  //11. 70600674
  //12. 76576500
  //13. 5537376230
  //14. 837799
  //15. 137846528820
  //16. 1366
  //17. 21124
  //18. 1074
  //19. 171
  //20. 648


}