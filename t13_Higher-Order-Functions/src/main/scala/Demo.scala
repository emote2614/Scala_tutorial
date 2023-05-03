object Demo {

  def math(x:Double, y:Double, f:(Double, Double) => Double) = f(x, y)
  def math2(x:Double, y:Double, z:Double, f:(Double, Double) => Double) = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    var result = math(50, 20, (x,y)=>x+y)
    println(result)  // 70

    result = math(50, 20, (x, y) => x min y)
    println(result) // 20
    result = math(50, 20, (x, y) => x max y)
    println(result) // 50

    var result2 = math2(50, 20, 10, (x,y)=> x + y)
    println(result2) // 80
    result2 = math2(50, 20, 10, _ max _)
    println(result2) // 50

  }
}
