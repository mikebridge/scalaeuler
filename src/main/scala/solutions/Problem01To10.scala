package solutions

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

  def primes(i: Long): List[Long] = {

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
    primes(x).max
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
      .map(primes(_))
      .foldLeft(List[Long]())(diffUnion)
      .foldLeft(1l)(_*_)

  }


}
