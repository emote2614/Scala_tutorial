object Demo {
  def main(args: Array[String]): Unit = {

    for(i <- 1 to 5){
      println("i using to " + i)
    }
    println("----------------------------")
    for (i <- 1.to(5)){
      println("i using to " + i)
    }
    println("----------------------------")
    for (i <- 1.until(6)) {
      println("i using to until " + i)
    }
    println("----------------------------")
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i using to until " + i + " " + j)
    }
    println("----------------------------")
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    for(i <- lst){
      println("i using lst " + i)
    }
    println("----------------------------")
    for(i <- lst; if i < 6){
      println("i using Filters " + i)
    }
    println("----------------------------")
    val result = for (i <- lst if i < 6) yield {
      i * i
    } // for + yield = 컬렉션을 변환하거나 필터링하는 작업을 수행
    println("result = " + result)

  }
}
