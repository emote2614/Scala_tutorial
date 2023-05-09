object Demo {

  val mymap:Map[Int, String] =
    Map(801 -> "Max", 802 -> "Tom", 804 -> "July", 804 -> "July2");

  val mymap2: Map[Int, String] =
    Map(805 -> "lua");

  def main(args: Array[String]): Unit = {
    println(mymap) // Map(801 -> Max, 802 -> Tom, 804 -> July)
    println(mymap(801)) // Max
//    println(mymap(803)) // Error
    println(mymap(804)) // July2
    println(mymap.keys) // Set(801, 802, 804)
    println(mymap.values) // Iterable(Max, Tom, July2)
    println(mymap.isEmpty) // False

    mymap.keys.foreach{ key =>
      print("key : " + key + '|')      // key : 801 | Value : Max
      println("Value : " + mymap(key)) // key : 802 | Value : Tom
    }                                  // key : 804 | Value : July2

    println(mymap.contains(801000)) // False
    println(mymap.contains(801)) // True

    println(mymap ++ mymap2) // mymap + mymap2
  }
}
