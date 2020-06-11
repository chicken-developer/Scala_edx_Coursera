package Excersice

 object NestedFunc {

 def main(args: Array[String]){
   println("Nested Function")
   //println( sum(1,2,3))
   println( factorialNested(5))
   findMax(printMax,5,10)
 }

 def factorial(number: Int): Int ={
   if( number <= 1) number
   else number * factorial(number - 1)
 }

   def factorialNested(number: Int): Int ={
     def helper(helpNumber: Int, cout: Int = number ) : Int={
       if(cout <= 1) helpNumber
       else helper(helpNumber* (cout - 1), cout - 1)
     }
     helper(number)
   }

   def printMax(number: Int, numer2: Int): Unit = {
   //  println(number)
     if( number > numer2) print(number)
     else  print(number)
   }

   def findMax(f: (Int, Int) => Unit, a: Int, b : Int ): Unit = {
   // side effecot
     f(a,b)
     print("Done!")
 }


// }
//
//  function(parameter) returntype
//
//def funcName( parameter: type,...)() () : ReturnType = {

   def add3Number(n1: Int, n2: Int, n3: Int): Int ={
     n1 + n2 + n3
   }

   def add3NumberC(n1: Int)(n2: Int)(n3: Int): Int ={
     n1 + n2 + n3
   }
   
}