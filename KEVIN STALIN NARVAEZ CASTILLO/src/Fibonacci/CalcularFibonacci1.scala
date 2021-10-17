package Fibonacci
object CalcularFibonacci1 extends  App {
    println("ingrese un numero para el fibonacci ")
    val  num1= scala.io.StdIn.readLine()
    val num=num1.toInt
    def clacularFibonacci(n: Int): Int ={
      if(n == 1) 0
      else if(n==2) 1
      else
        clacularFibonacci(n - 2) + clacularFibonacci(n - 1)
    }
    println(clacularFibonacci(num))
}