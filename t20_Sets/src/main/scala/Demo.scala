object Demo {

  val mylist2:List[Int] = List(1,2,3,4,5,5)
  val myset:Set[Int] = Set(1, 1, 2, 3, 4, 4)
  val myset2:Set[Int] = Set(3, 3, 3, 4, 4, 5, 6, 6, 8)
  val names:List[String] = List("A","B","C","D","E","F")

  def main(args: Array[String]): Unit = {
    println(mylist2) // List(1, 2, 3, 4, 5, 5)
    println(myset) // Set(1, 2, 3, 4)
    println(myset + 10) // Set(1, 2, 3, 4, 10)
    println(myset(8)) // false  8 존재 x

    println(names.head) // A
    println(names.tail) // List(B,C,D,E,F)
    println(names.isEmpty) // false

    println(myset ++ myset2) // (합집합)
    println(myset.++(myset2)) // (합집합)

    println(myset -- myset2) // (차집합)
    println(myset.--(myset2)) // (차집합)

    println(myset.&(myset2)) // (교집합)
    println(myset.intersect(myset2)) // (교집합)

    println(myset.max) // 4
    println(myset.min) // 1
    println(names.max) // F

    myset.foreach(println) // 1\n 2\n 3\n 4\n

    for(name <- names){
      println(name) // A\n B\n C\n D\n ... 
    }



  }
}
