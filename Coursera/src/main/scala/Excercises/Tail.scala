package Excercises

import scala.annotation.tailrec

object Tail{
  def main(args: Array[String]): Unit ={
    println("Result of gdc: " + gdc(14,21))
    println("Result of factorial: " + factorial(5))
  }

@tailrec
  def gdc(firstNumber: Int, secondNumber: Int): Int ={
    if(secondNumber == 0) firstNumber
    else gdc(secondNumber, firstNumber % secondNumber)
  }

  def factorial(number: Int ) : Int ={
    @tailrec
    def factorialHelper(number: Int, cout: Int = number) : Int ={
      if (cout == 1 ) number
      else factorialHelper(number * (cout - 1), cout - 1)
    }
    factorialHelper(number)
  }


  def f1(a: Int, b: Int): Int = a + b//Phiên bản bình thường, nhận vào 2 số nguyên và trả về 1 số nguyên
  val f2: (Int, Int) => Int = f1 // Vẫn là phiên bản bình thường, hằng số f2 là 1 hàm không tên( Hàm này nhận vào 2 số nguyên và trả về 1 số nguyên, chính là hàm f phía trên), và gán nó bằng hàm f
  def f(a: Int)(b: Int): Int = a + b// Hàm f phiên bản currying :v . Hiểu nôm na là hàm f này nhận vào số nguyên a và trả về 1 hàm (mà hàm đó - mình tạm gọi là f2 nhận vào số nguyên b và f2 trả về 1 số nguyên)
  val f3: Int => Int => Int = f2.curried // Cũng là phiên bản currying,
  val f4: (Int, Int) => Int = Function.uncurried(f3) // g
}
