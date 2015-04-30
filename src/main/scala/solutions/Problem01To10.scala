package solutions

import scala.collection.mutable

object Problem01To10 {

  def Problem01(max: Int) = {

    (0 until max).view
      .filter(x => x % 5 == 0 || x % 3 == 0)
      .sum

  }

  def Problem02(max: Int) = {
    // see; http://www.scala-lang.org/docu/files/collections-api/collections_14.html
    def fib(i: Int, j:Int): Stream[Int] = {
      i #:: fib(j, i + j)
    }
    fib(0,1).takeWhile(x => x < max).filter(x => x %2 == 0).sum
  }

  def primeFactors(i: Long): List[Long] = {

    def primes(num: Long, current: Int): List[Long] = {
      if (num == current)
        List(num)
      else if (num % current == 0)
        current :: primes(num / current, current)
      else
        primes(num, current + 1)
    }
    primes(i, 2)

  }

  def Problem03(x: Long) = {
    primeFactors(x).max
  }

  def isPalindrome(x: Int): Boolean = {
    val str = x.toString();
    val len = str.length();
    return (0 until str.length / 2)
      .forall(pos => str.charAt(pos) == str.charAt(len - pos - 1))
  }

  def palindromes =
    for (i <- 999 to 100 by -1;
         j <- 999 to i by -1 if isPalindrome(i * j))
    yield i * j

  def Problem04() = {
    palindromes.max
  }

  def diffUnion[A](x:List[A], y:List[A]) = {
    x.diff(y).union(y)
  }

  def Problem05(i: Long) = {
    (i until i / 2 by -1)
      .map(primeFactors(_))
      .foldLeft(List[Long]())(diffUnion)
      .foldLeft(1l)(_*_)
  }

  def Problem06(pos: Int) = {
    math.pow((1 to pos).sum,2).toInt - (1 to pos).map(x => x * x).sum
  }

  def Problem07(pos: Int) = {
    // TODO: revisit this
    //def isPrime(x: Long) = { primes(x).length == 1 }
    Iterator.from(2).filter(isPrime(_)).take(10001).drop(10000).next
  }

  def Problem08() = {
    prob8.map(_.asDigit.toLong)
         .sliding(13)
         .map(_.foldLeft(1L)(_ * _))
         .max
  }

  def Problem09() = {

    val x = for (a <- 1 to 1000;
         b <- a to 1000;
         c <- b to 1000 if (a * a + b * b == c * c && a + b + c == 1000))
      yield a * b * c
    x.head
  }

  def isPrime(x: Long) = {
    if (x == 3 || x == 2) {
      true
    } else if (x % 2 == 0 || x % 3 == 0) {
      false
    } else  {
      val sqrt = Math.sqrt(x).toInt
      (5 to sqrt).forall(n => x % n != 0 && x % (n + 2) != 0)
    }

  }

  // https://pavelfatin.com/scala-for-project-euler/
  val primes: Stream[Long] = 2 #::
    Stream.from(3, 2)
          .map(_.toLong)
          .filter(i => primes.takeWhile(j => j * j <= i)
                             .forall(i % _ > 0))


  def Problem10() = {
    primes.view.takeWhile(_ < 2000000).sum;
  }

  val prob8 = """73167176531330624919225119674426574742355349194934
              |96983520312774506326239578318016984801869478851843
              |85861560789112949495459501737958331952853208805511
              |12540698747158523863050715693290963295227443043557
              |66896648950445244523161731856403098711121722383113
              |62229893423380308135336276614282806444486645238749
              |30358907296290491560440772390713810515859307960866
              |70172427121883998797908792274921901699720888093776
              |65727333001053367881220235421809751254540594752243
              |52584907711670556013604839586446706324415722155397
              |53697817977846174064955149290862569321978468622482
              |83972241375657056057490261407972968652414535100474
              |82166370484403199890008895243450658541227588666881
              |16427171479924442928230863465674813919123162824586
              |17866458359124566529476545682848912883142607690042
              |24219022671055626321111109370544217506941658960408
              |07198403850962455444362981230987879927244284909188
              |84580156166097919133875499200524063689912560717606
              |05886116467109405077541002256983155200055935729725
              |71636269561882670428252483600823257530420752963450""".stripMargin.replaceAll("\n", "")

}
