object Demo {

  val myarray:Array[Int] = new Array[Int](4)
  val myarray2 = new Array[Int](5)
  val myarray3 = Array(1, 2, 3, 4, 5, 6, 7)

  def main(args: Array[String]): Unit = {

    myarray(0) = 20
    myarray(1) = 50
    myarray(2) = 10
    myarray(3) = 30
    println(myarray.length) // 4
    for(x <- myarray){
      println(x) // 20, 50, 10, 30
    }
    println(myarray2.length) // 5
    for(i <- 0 to (myarray.length - 1)){
      println(myarray(i)) // 20, 50, 10, 30
    }
    println()
    for(y <- myarray2){
      println(y) // 0, 0, 0, 0, 0
    }
    println()
    for (z <- myarray3) {
      println(z) // 1, 2, 3, 4, 5, 6, 7
    }
    println()
    val result = Array.concat(myarray, myarray3)
    for(x <- result){
      println(x) // 20,50,10,30,1,2,3,4,5,6,7
    }

  }
}
