object Demo {

  //            Getter? Setter?
  //------------------------------
  //var           yes     yes
  //val           yes     no
  //default       no      no

  class User(var name:String, var age:Int){
    def this(){
      this("Tom", 32)
    }
    def this(name:String){
      this(name, 32)
    }
  }

  def main(args: Array[String]): Unit = {
    var user1 = new User("Max", 28)
    var user2 = new User()
    var user3 = new User("Max")
    println(user1.name + " " + user1.age) // Max 28
    println(user2.name + " " + user2.age) // Tom 32
    println(user3.name + " " + user3.age) // Max 32
  }
}
