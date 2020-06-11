package Excercises

class BackAccout{
  private var balance = 0

  def checkBalance = println(balance): Unit

  def deposit(amout: Int) ={
    if(amout > 0) balance = balance + amout
  }: Unit

  def withdraw(amout: Int) = {
    if(0 < amout && amout < balance){
      balance = balance - amout
      balance
    } else throw  new Error("Insuffiecient funds")
  }: Int

}

object Accout{
  def main(args: Array[String]): Unit ={
    val acc = new BackAccout
    acc deposit 50
    acc deposit 30
    acc.checkBalance
  }

}
