package Excercises

case class Book(title: String, authors: List[String])

object QueriesWithFor {
  def main(args: Array[String]): Unit ={
  val books = List(
      Book("Clean Code", List("Martin", "Joseph")),
      Book("Code Completed", List("Anubis","Eajipheni")),
  ): List[Book]

    for(b <- books; a <- b.authors if a startsWith("Mar") )  println(b.authors)
    for{
      b1 <- books
      b2 <- books
      if(b1 != b2)
      a1 <- b1.authors
      a2 <- b2.authors
      if(a1 == a2)
    } yield  a1

    println("End program")
  }


}
