package Metodos

object UsoMetodos extends App {
  val lista1 : List[Int]=List(1,2,3,4,5,6,7,8,9,0)
  val lista2: List[Int]= List(2,3,5,7,11,13,17,19)

   //1.- Métodos para conectar dos o más listas

   var CListas1 =lista1 ::: lista2
   print("Usando operador  (:::)   = "+CListas1+"\n")
  var CListas2 =lista1.:::(lista2)
  print("Usando metodo Set {  .:::()   }   = "+CListas2+"\n")
  var CListas3 =List.concat(lista1,lista2)
  print("Usando metodo concat   = "+ CListas3 +"\n")

  //2.- Método List.fill () para crear una lista de elementos con un número específico de repeticiones:
  //Repite 2 veces  las vocales
   val lista3=List.fill(2)("a","e","i","o","u")
  print(""+lista3 +"\n")
  //repite 12 veces el elemnto 4
  val lista4=List.fill(12)(4)
  print(""+lista4+"\n")

  //3.-El método List.tabulate () es crear una lista a través de una función determinada, el valor inicial es 0
// Presenta los 7 primeros numeros iniciando desde el 0, multiplicados x2
  val listaX2= List.tabulate(7)(n => n * 2)
  println ("Lista unidimencional q precenta los 7 primeros numeros multiplicados x2 = " + listaX2 +"\n")

 //4.-List.reverse
  //List.reverse se usa para invertir el orden de la lista.
  val lisRever ="a" :: ("e" ::"i" ::"o"::("u" :: Nil))
  println ("sin reversion:" + lisRever)
  println ("lista revertida:" + lisRever.reverse )

//5.- Determina si el elemento especificado en la lista existe.
 print("existe la j "+lisRever.exists( s=>s=="j") +"\n")
  print("existe la e "+lisRever.exists( s=>s=="e") )
}
