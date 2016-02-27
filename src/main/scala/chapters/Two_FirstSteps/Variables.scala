package chapters.Two_FirstSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */

/**
 * val and var
 *
 */
object Variables {


  // A val is similar to a final variable in Java. Once initialized, a val can never be reassigned.
  //A var can be reassigned throughout its lifetime.

  def variables: Unit = {

    //Variables type is inferred
    val msg = "Hello, world!"
    val msg2: String = "Hello 2"

    //we can't reasing a val
    // msg = "nuevo mensaje"   Esto no se puede hacer

    /*--------------------------------------------------------------------------------------------------------------------*/
    var greeting = "Hello, world!"
    greeting = "nuevo mensaje"

    println(greeting)
  }


}
