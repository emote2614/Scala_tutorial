object Demo {

  val lst = List(1, 2, 3, 4, 5)
  val lst2 = List("A", "B", "C")
  def main(args: Array[String]): Unit = {
    println(lst.reduceLeft(_ + _)) // 15
    println(lst.reduceRight(_ + _)) // 15
    println("@1-------------")
    println(lst.reduceLeft((x,y) => {println(x + " , " + y); x+y}))
    println("@2-------------")
    println(lst.reduceRight((x,y) => {println(x + " , " + y); x+y}))
    println("--------------")
    println(lst.reduceLeft(_ - _)) // -13
    println(lst.reduceRight(_ - _)) // 3
    println("@3-------------")
    println(lst.reduceLeft((x,y) => {println(x + " , " + y); x-y}))
    println("@4-------------")
    println(lst.reduceRight((x,y) => {println(x + " , " + y); x-y}))

    println(lst.foldLeft(100)(_ + _)) // 115 시작값이 100인 상태에서 시작
    println(lst2.foldLeft("z")(_ + _)) // zABC
    println(lst2.foldRight("z")(_ + _)) // ABCZ

    println(lst.scanLeft(100)(_ + _)) // List(100, 101, 103, 106, 110, 115)
    println(lst2.scanLeft("z")(_ + _)) // List(z, zA, zAB, zABC)
  }
}
