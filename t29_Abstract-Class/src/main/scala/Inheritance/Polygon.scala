package Inheritance

abstract class Polygon {
  def area:Double
}

object Polygon{
  def main(args: Array[String]): Unit = {
    var rect = new Rectangle(55.2, 20.0)
    printArea(rect) // 1104.0
    var tri = new Triangle(55.2, 20.0)
    printArea(tri) // 552.0

  }

  def printArea(p:Polygon): Unit = {
    println(p.area)
  }
}
