object Demo {
  def main(args: Array[String]): Unit = {

    val age = 50
    println("1-------------------")
    age match{
      case 20 => println(age+ " 1")
      case 19 => println(age+ " 2")
      case 18 => println(age+ " 3")
      case 17 => println(age+ " 4")
      case 16 => println(age+ " 5")
      case _ => println("DEFAULT")
    }
    println("2-------------------")
    val result = age match {
      case 20 => age
      case 19 => age
      case 18 => age
      case 17 => age
      case 16 => age
      case _ => 999
    }
    println("result = " + result)
    println("3-------------------")
    var i = 7
    i match{
      case 1|3|5|7|9 => println("odd")
      case 2|4|6|8|0 => println("even")
    }


  }
}
