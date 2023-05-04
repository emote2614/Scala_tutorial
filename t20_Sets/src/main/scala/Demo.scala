object Demo {

  val mylist2:List[Int] = List(1,2,3,4,5,5)
  val mylist:Set[Int] = Set(1, 1, 2, 3, 4, 4)
  val names:List[String] = List("A","B","C")

  def main(args: Array[String]): Unit = {
    println(mylist2) // List(1, 2, 3, 4, 5, 5)
    println(mylist) // Set(1, 2, 3, 4)


  }
}
