object Demo {

  object Math {
    def +(x: Int = 45, y: Int = 15): Int = {
      return x + y
    }
    def **(x: Int) = x * x
  }

  def print(x: Int, y:Int): Unit = {
    println(x+y)
  }

  def main(args: Array[String]): Unit = {

    var add = (x:Int,y:Int)=> x+y // 익명함수
    println(add(300, 500)) // 800

    val sum = 10 + 20;
    print(100, 200)        // 300
    println(Math.+())      // 45 + 15
    println(Math.+(60))    // 60 + 15
    println(Math.+(60,30)) // 60 + 30
    println(Math ** 3)     // 9
  }
}
