package chapters.Two_FirstSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */

/**
 * while
 * for
 * foreach
 * foreach notation
 */
object Iteration {


  def whileIteration: Unit = {

    var i = 0
    val cadena = "my cadena"
    while (i < cadena.length) {
      println(cadena(i))

      //Note that Java’s ++i and i++ don’t work in Scala
      i += 1
    }
  }


  def forAndForeachIteration = {

    val args = Array("probando", "la", "iteracion")
    //the Scala interpreter infers the type of arg to be String
    args.foreach(arg => println(arg))

    //To be more explicit we can do this
    args.foreach((arg: String) => println(arg))

    //This also works
    args.foreach(println(_))

    //And also this
    args.foreach(println)

    //clasic java foreach
    //arg can’t be reassigned inside the body of the for expression.
    for (arg <- args)
      println(arg)

  }

}
