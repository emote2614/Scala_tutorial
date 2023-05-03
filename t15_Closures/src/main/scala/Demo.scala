import Demo.number

object Demo {
  var number = 10
  val add = (x:Int) => {
    number = x + number
    number
  }

  def main(args: Array[String]): Unit = {
    number = 100
    println(add(20)) // 120
    println(number) // 120 (클로저 내부에서 변경된 사항이 a로 다시 전달됨을 의미)

  }
}
