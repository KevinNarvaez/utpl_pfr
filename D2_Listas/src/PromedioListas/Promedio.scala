package PromedioListas
object Promedio extends App {
  val lista : List[Int]=List(1,2,3,4,5,6,7,8,9,0)
  var promedio :Double=lista.foldLeft(0.0)(_ + _)/lista.length
println( promedio )
}