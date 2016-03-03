package EigthFunctionAndClosures

/**
  * Created by joan on 27/12/15.
  */


/**
  * Closures
  * Closure por parameter
  * Repeated parameters
  * passing repeatedParameters to method as an array
  * Named arguments
  * Default parameter values
  */


object Closures {


  // when we use the closure, the valueas are evaluated at that time
  def creatingAClousure(): Unit = {
    var more = 1
    val addMore = (x: Int) => x + more
    more = 5
    println(addMore(1))
  }


  def passClosureToMethod(): Unit = {

    def closureMethod(closure: () => Unit): Unit = {
      closure()
      println("dentro de func")
    }

    closureMethod(() => println("closure pasado por param"))
  }


  def passClosureToMethodTwo(): Unit = {

    def closureMethod(callback: Int => String) {
      val x = callback(2)
      println(x)
    }

    val clo = (x: Int) => {
      println(x)
      "probando"
    }
    closureMethod(clo)


  }

  //Repeated Parameters
  //Inside the function, the type of the repeated parameter is an Array of the declared type of the parameter.
  def echo(args: String*) =
    for (arg <- args) println(arg)

  def callRepeatedParameters(): Unit = {
    echo("a", "b")

    val arr = Array("What's", "up", "doc?")
    //This notation tells the compiler to pass each element of arr as its own argument
    //to echo, rather than all of it as a single argumen
    echo(arr: _*)

  }


  def NamedParameters(): Unit = {
    def callWithNamedParameters(a: Int, b: String) {}
    callWithNamedParameters(b = "ala", a = 2)
  }

  def defaultParameters(): Unit = {
    def callWithDefaultParameters(a: Int = 2, b: String) {}
    callWithDefaultParameters(b = "ala")
  }


}
