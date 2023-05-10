import Demo.method1

//class strict{
//  val e = {
//    println("strict")
//    9
//  }
//}
//
//class LazyEval{
//  lazy val l = {
//    println("lazy")
//    8
//  }
//}

object Demo {
//  def main(args: Array[String]): Unit = {
//    val x = new strict
//    val y = new LazyEval
//
//    println(x.e)
//    println(y.l)

    def method1(n:Int): Unit = {
      println("Method 1")
      println(n)
    }
    def method2(n: => Int): Unit = {
      println("Method 2")
      println(n)
    }

  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }
    method1(add(5, 6))
    method2(add(5, 6))

  }
}
