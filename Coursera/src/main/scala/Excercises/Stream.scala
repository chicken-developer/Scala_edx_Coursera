package Excercises

object Stream {
  def main(args: Array[String]): Unit = {
    //expr
    println(primes.take(100).toList)
    println(lazySqrt(4).take(10).toList)
  }
  def expr={
    val x = { print("x"); 1}
    lazy val y = { print("y"); 2}
    def z = { print("z"); 3}
    z + y + x + z + y + x
  }// Will print xzyz
  // x is normal val, so it call when it define only one time
  // y is lazy val, so it define call when call
  // z is function normal, so it call when define and call it
  def list(n: Int): List[Int] = n :: list(n + 1) // List

  def from(n: Int): LazyList[Int] = n #:: from(n+1) //Steam

  def sieve(s :LazyList[Int]) : LazyList[Int] =
    s.head #:: sieve(s.tail filter(_ % s.head != 0))
  val primes = sieve(from(2))

  def lazySqrt(x: Double): LazyList[Double] = {
    def improve(guess: Double) = (guess + x/guess)/ 2
    lazy val guesses: LazyList[Double] = 1 #:: (guesses map improve)
    guesses
  }
}
