object Demo {

  def add(x:Int, y:Int) = x + y

  def add2(x:Int) = (y:Int) => x + y

  def add3(x:Int) (y:Int) = x + y

  def main(args: Array[String]): Unit = {
    println(add(20, 10))  // 30

    println(add2(20)(10)) // 30
    val sum40 = add2(40)
    println(sum40(50)) // 90

    println(add3(100)(200)) // 300

    val sum50 = add3(50)_
    println(sum50(50)) // 100


  }
}
