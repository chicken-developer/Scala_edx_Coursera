package Excercises

 object LearnMonad{
    def main(args: Array[String]): Unit ={
      println("Hello Monad")
      (1 to 1000).toStream
    Stream}

    trait Monad[T]{
      def flatMap[U](f: T => Monad[U])
    }
   // def unit[T](x: T): Monad[T]
}
