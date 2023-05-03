object Demo {

  val num1 = 75
  val num2 = 100.25
  val str1 : String = "Hello World"
  val str2 : String = " Max"
  def main(args: Array[String]): Unit = {
    println(str1.length()) // 11
    println(str1.concat(str2)) // Hello World Max
    println(str1 +str2) // Hello World Max

    val result = printf("(%d -- %f -- %s)\n", num1, num2, str1) // (75 -- 100.250000 -- Hello World)
    println(result) // ()
    println("(%d -- %f -- %s)".format(num1, num2, str1)) // (75 -- 100.250000 -- Hello World)
    printf("(%d -- %f -- %s)", num1, num2, str1) // (75 -- 100.250000 -- Hello World)

  }
}
