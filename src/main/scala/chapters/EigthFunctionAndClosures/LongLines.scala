package EigthFunctionAndClosures

import scala.io.Source

/**
  * Created by joan on 27/12/15.
  */

/**
  * private method
  * Method inside method
  * function literal
  * function literal in foreach and filter
  * Placeholder syntax
  * Especify type using colon
  */
object LongLines {

  // A normal method
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  // A private method
  private def processLine(filename: String,
                          width: Int, line: String) {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }


  //you can define functions inside other functions.
  def processFileTwo(filename: String, width: Int) {
    def processLine(filename: String,
                    width: Int, line: String) {
      if (line.length > width)
        println(filename + ": " + line)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines()) {
      processLine(filename, width, line)
    }
  }


  var increase = (x: Int) => x + 1
  println(increase(4))

  val increase2 = (x: Int) => {
    println("We")
    println("are")
    println("here!")
    x
  }


  //foreach expects a function literal
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x: Int) => println(x))

  // scala interpreta que x es int
  someNumbers.foreach(x => println(x))

  //you can use underscores as placeholders for one or more parameters, so long as each parameter appears only one time within the function literal.
  someNumbers.filter(_ > 0)

  //Especify type using colon
  val f = (_: Int) + (_: Int)
  f(3, 6)


}