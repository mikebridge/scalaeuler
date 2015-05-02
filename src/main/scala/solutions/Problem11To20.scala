package solutions

import scala.collection.mutable
/**
 * Created by bridge on 30/04/15.
 */
object Problem11To20 {
  def Problem11 = {

    val h = 20
    val maxhoriz = matrix11.map(maxProduct(_)).max
    val maxvert = transpose(matrix11).map(maxProduct(_)).max
    val maxdiag1 = transpose((0 until h).map(x => zeroArray(x) ++ matrix11(x) ++ zeroArray(h - x)).toArray).map(maxProduct(_)).max
    val maxdiag2 = transpose((0 until h).map(x => zeroArray(h - x) ++ matrix11(x) ++ zeroArray(x)).toArray).map(maxProduct(_)).max

    Array(maxhoriz, maxvert, maxdiag1, maxdiag2).max
  }

  def Problem12 = {
    def numFactors(x: Int): Int = {
      (1 to x).takeWhile(n => n * n <= x)
              .foldLeft(0)((count, n) => if (x % n == 0) count + 2 else count)
    }
    def triangleTerm(x: Int) = (x + 1) * x / 2
    Iterator.from(1).map(triangleTerm(_)).dropWhile(x => numFactors(x) < 501).next
  }


  def Problem13 = {
    "0000000000"
  }



  def zeroArray(len:Int) = Array.fill(len)(0)
  def transpose(matrix: Array[Array[Int]]):Array[Array[Int]] = {
     (for (r <- 0 until matrix(0).length; c <- 0 until matrix.length) yield
        matrix(c)(r)).grouped(matrix.length).map(_.toArray).toArray
  }
  def maxProduct(row: Array[Int], groupSize: Int = 4): Int = {
    row.sliding(groupSize).map(_.product).max
  }

  val matrix11 = Array(
    Array(8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8),
    Array(49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0),
    Array(81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65),
    Array(52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91),
    Array(22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80),
    Array(24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50),
    Array(32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70),
    Array(67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21),
    Array(24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72),
    Array(21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95),
    Array(78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92),
    Array(16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57),
    Array(86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58),
    Array(19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40),
    Array(4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66),
    Array(88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69),
    Array(4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36),
    Array(20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16),
    Array(20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54),
    Array(1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48))
}
