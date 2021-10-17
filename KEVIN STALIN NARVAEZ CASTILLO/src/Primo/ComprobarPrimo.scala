package Primo

object ComprobarPrimo extends App{
  println("ingrese un numero a comprobar ")
  val  num1= scala.io.StdIn.readLine()
  val num=num1.toInt
  val cont=num-1
  def comprobarPrimo(n: Int,c :Int  ): Int ={
    if(c>1 ) {
      if (n % c == 0) 0
      else comprobarPrimo(n, c - 1)
    }else 1
  }
  if(comprobarPrimo(num,cont)==0 || num==1 )print("no es primo")
  else print("es primo")
}