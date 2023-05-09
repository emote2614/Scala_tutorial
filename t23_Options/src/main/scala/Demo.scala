object Demo {
  val lst = List(1, 2, 3)
  val map = Map(1->"Tom", 2->"Max", 3->"John")
  val opt : Option[Int] = None
  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 6)) // None
    println(lst.find(_ > 2)) // Some(3) // 인덱스2 = 3
    println(lst.find(_ > 1).get) // 2
    println(lst.find(_ > 3).getOrElse("0000")) // 0000
    println(map.get(1)) // Some(Tom)
    println(map.get(3).get) // John
    println(map.get(5).getOrElse("No name found")) // No name found

    println(opt.isEmpty) // true
//    println(opt.get) // Error
  }
}
