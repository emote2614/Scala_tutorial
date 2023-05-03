object Demo {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }
    def square(x: Int) = x*x;
  }
  def subtract(x: Int, y: Int): Int = x - y
  def multiply(x: Int, y: Int): Int = x * y
  def devide(x: Int, y: Int) = x / y

  def main(args: Array[String]): Unit = {
    println(Math.add(45, 15)) // 60
    println(Math.square(3)) // 9
    println(Math square 3) // 9
    println(subtract(45, 15)) // 30
    println(multiply(45, 15)) // 675
    println(devide(45, 15)) // 3
  }
}
