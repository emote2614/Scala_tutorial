object Demo {

  val lst = List(1, 2, 3, 4, 5, 6, 7)
  val mymap = Map(1->"Tom", 2->"Max", 3->"John")
  def main(args: Array[String]): Unit = {
    println(lst.map(_ * 2)) // List(2, 4, 6, 8, 10, 12, 14)
    println(lst.map(x => x * 2)) // List(2, 4, 6, 8, 10, 12, 14)
    println(lst.map(x => "hi" * x)) // List(hi, hihi, hihihi...)
    println(mymap.map(x => "hi" + x)) // List(hi(1,Tom), hi(2,Max), hi(3,John))
    println("hello".map(_.toUpper)) // HELLO
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten) // List(1, 2, 3, 3, 4, 5
    println(lst.flatMap(x => List(x, x+1))) // List(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8)
    println(lst.map(x => List(x, x+1))) // List(List(1, 2), List(2, 3), ....)

    println(lst.filter(x => x%2!=0)) // List(1, 3, 5, 7)
    println(lst.filter(x => x%2==0)) // List(2, 4, 6)

  }
}
