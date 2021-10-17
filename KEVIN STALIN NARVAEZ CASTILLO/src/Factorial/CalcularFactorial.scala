package Factorial

object CalcularFactorial extends App {
  println("ingrese un numero ")
  val  num1= scala.io.StdIn.readLine()
  val num=num1.toInt
  def clacularFactorial(n:Int): Long ={
    if(n <= 0) 1
    else  n * clacularFactorial(n-1)
  }
  println(clacularFactorial(num))
}