package chapters.Third_NextSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */

/**
 * Creating an array.
 * escribiendo un valor de array.
 */

object Arrays {

  //As you’ve seen, a Scala array is a mutable sequence of objects that all share the same type.
  // An Array[String] contains only strings, for example.

  //Although you can’t change the length of an array after it is instantiated, you can change its element values.
  // Thus, arrays are mutable objects.

  def createArray(): Unit = {

    //This code creates a new array of length three, initialized to the passed strings, "zero" , "one" , and "two" .
    // The compiler infers the type of the array to be Array[String]
    val numNames = Array("zero", "one", "two")

    //this is what is realy called
    val numNames2 = Array.apply("zero", "one", "two")

    numNames(2) = "five"

  }


}
