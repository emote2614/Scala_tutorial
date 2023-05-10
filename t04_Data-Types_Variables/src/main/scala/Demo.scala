object Demo {
  def main(args: Array[String]): Unit = {
    val a:Int = 12
    println(a+30) //42

    var b:Double = 12.5
    println(b+40) //52.5

    //    a = 30  (error val)
    b = 30 // (not error var)

    val x = {val a:Int = 200; val b:Int = 300; a+b}
    println(x) // 500

    val y = {
      val a:Int = 500
      val b:Int = 600
      a+b
    }
    println(y) // 1100

  }
}
