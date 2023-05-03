import java.util.Date

object Demo {

  def log(date: Date, message: String)={
    println(date + "    "  + message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a:Int, b:Int, c:Int) => a + b + c

    val f = sum(10, 20, _: Int) // wild card

    val d = sum(10, _:Int, _:Int)

    println(sum(10, 20, 30)) // 60
    println(f(40)) // 70 (10+20+40)
    println(d(100, 200)) // 310 (10+100+200)

    val date = new Date
    val newLog = log(date, _ :String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")


  }
}
