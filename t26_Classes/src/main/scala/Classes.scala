object Classes {

  class User(private var name:String, val age:Int){
    def printName{println(name)}
  }

  class User2(var name:String, val age:Int){
    def printName{println(name)}
  }

  def main(args: Array[String]): Unit = {
    var user = new User("Max", 28)
    user.printName // Max
    println(user.age) // 28

    var user2 = new User2("Jack", 18)
    user2.printName // Jack
    user2.name = "test"
//    user2.age = 29
  }

}
