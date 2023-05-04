object Demo {

  val mylist:List[Int] = List(1,2,3,4,5,6,7)
  val names:List[String] = List("A", "B", "C")

  def main(args: Array[String]): Unit = {

//    mylist(0) = 99  변경 불가

    println(mylist) // List(1, 2, 3, 4, 5, 6, 7)
    println(0 :: mylist) // List(0, 1, 2, 3, 4, 5, 6, 7) 0 추가
    println(names) // List(A, B, C)
    println(Nil) // List()
    println(1 :: 5 :: 9 :: Nil) // List(1, 5, 9)
    println(mylist.head) // 1
    println(names.tail) // List(B, C)
    println(mylist.tail) // List(2, 3, 4, 5, 6, 7)
    println(names.isEmpty) // false
    println(names.reverse) // List(C, B, A)
    println(List.fill(5)(2)) // List(2, 2, 2, 2, 2)

    println(mylist.max) // 8
    mylist.foreach(println) // 한줄씩 출력
    var sum:Int = 0
    mylist.foreach(sum += _)
    println(sum) // 33

    for(name <- names){
      println(name) // 한줄씩 출력
    }
    println(names(0)) // A

  }
}
