object Demo {

  val mytuple = (1, 2, "hello", true)
  val mytuple2 = new Tuple3(1, 2, "hello") // Tuple뒤 개수작성
  val mytuple3 = new Tuple3(1, "hello", (2, 3))

  def main(args: Array[String]): Unit = {
    println(mytuple) // (1,2,hello,true)
    println(mytuple._3) // hello
    println(mytuple._4) // true
    println()
    mytuple.productIterator.foreach{
      i => println(i) // mytuple 요소 하나씩 출력
    }

    println(1 -> "Tom") // (1, Tom)
    println(1 -> "Tom" -> true) // ((1, Tom), true)
    println(mytuple3._3) // (2, 3)

  }
}
