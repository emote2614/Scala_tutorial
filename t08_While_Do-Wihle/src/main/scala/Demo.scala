object Demo {
  def main(args: Array[String]): Unit = {
    var x = 0

    while (x < 10) {
      println("x = " + x)
      x += 1 // x = x + 1
    }

    var num = 1
    var sum = 0

    do{
      sum += num
      num += 1
    }while(num <= 10)

  }
}
