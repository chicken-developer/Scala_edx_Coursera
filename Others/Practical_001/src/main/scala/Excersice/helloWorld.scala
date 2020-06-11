package Excersice

object helloWorld{
  val Grade_1: List[String] = List()
  val Grade_2 : List[String] = List()

  def main(args: Array[String]): Unit ={
   // println("Hello")
 //   twoFer("Bob")
//    println(checkLeapYear(1996))
      println(addStudent("Add Jim to grade 2"))
    println(Grade_2)
 //   println(checkYearOld(convertToEarthYear(second = 1000000000),"Mercury"))
  }

  def twoFer( name: String): Unit ={
    println(" One for " + name + ", one for me.")
  }

  def checkLeapYear(year: Int) : Boolean = {
    year % 4 == 0
  }

  /*
  Mercury: orbital period 0.2408467 Earth years
Venus: orbital period 0.61519726 Earth years
Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
Mars: orbital period 1.8808158 Earth years
Jupiter: orbital period 11.862615 Earth years
Saturn: orbital period 29.447498 Earth years
Uranus: orbital period 84.016846 Earth years
Neptune: orbital period 164.79132 Earth years
So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.
   */

   def convertToEarthYear(second: Int) : Double = second / (60*60*24*365)

  def checkYearOld(second: Double, star: String): Double ={
    star match {
      case "Mercury" => { println("They are " +second * 0.24 + " Mercury-years old"); second * 0.24}
      case "Venus" => second * 0.615
      case "Earth" => second
      case "Mars" => second * 1.88
      case "Jupitor" => second * 11.86
      case "Saturn" => second * 29.447
      case "Uranus" => second * 84.016
      case "Neptune" => second * 164.79
      case _ => throw  new Error("No have this case")
    }
  }


  /*
    Given students' names along with the grade that they are in, create a roster for the school.

  In the end, you should be able to:

  Add a student's name to the roster for a grade
  "Add Jim to grade 2."
  "OK."
  Get a list of all students enrolled in a grade
  "Which students are in grade 2?"
  "We've only got Jim just now."
  Get a sorted list of all students in all grades. Grades should sort as 1, 2, 3, etc., and students within a grade should be sorted alphabetically by name.
  "Who all is enrolled in school right now?"
  "Grade 1: Anna, Barb, and Charlie. Grade 2: Alex, Peter, and Zoe. Grade 3…"
  Note that all our students only have one name. (It's a small town, what do you want?)
     */
  def addStudent(addAsk: String): String ={
   //add here
    val trimmedList: List[String] = addAsk.split(" ").map(_.trim).toList
    val badWords = List("Add","to","grade")
    val filteredWords = trimmedList.filter(!badWords.contains(_))
    val grade = filteredWords(1)
    addToList(filteredWords(0) ,grade match {
      case "1" => Grade_1
      case "2" => Grade_2
      case _ => Grade_1
    })
    filteredWords
    "OK."
  }

  def addToList(studentName: String, listStudent: List[String]) ={
    listStudent ::: List(studentName)
  }
}