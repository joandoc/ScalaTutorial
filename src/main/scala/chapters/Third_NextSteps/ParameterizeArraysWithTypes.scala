package chapters.Third_NextSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */
object ParameterizeArraysWithTypes {


  def parametrizeArrayWithTypes(): Unit = {

    //Note that when you parameterize an instance with both a type and a value, the type comes first in its square brackets,
    // followed by the value in parentheses.
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    for (i <- 0 to 2)
      print(greetStrings(i))

    //To be more explicit we can do this
    val greetStrings2: Array[String] = new Array[String](3)

  }

  def howMethodWorks(): Unit = {


    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    //if a method takes only one parameter, you can call it without a dot or parentheses.
    // method to. Is converted to (0).to(2)
    for (i <- 0 to 2)
      print(greetStrings(i))

    //When you apply parentheses surrounding one or more values to a variable, Scala will transform the code
    // into an invocation of a method named apply on that variable. So greetStrings(i) gets transformed into greetStrings.apply(i).
    //This principle is not restricted to arrays: any application of an object to some arguments in parentheses will be
    //transformed to an apply method call.


    //Similarly, when an assignment is made to a variable to which parentheses and one or more arguments have been applied,
    // the compiler will transform that into an invocation of an update method that takes the arguments in parentheses as well
    // as the object to the right of the equals sign. For example:

    //greetStrings(0) = "Hello"
    //will be transformed into:
    //greetStrings.update(0, "Hello")

    val greetStrings2 = new Array[String](3)
    greetStrings2.update(0, "Hello")
    greetStrings2.update(1, ", ")
    greetStrings2.update(2, "world!\n")
    for (i <- 0.to(2))
      print(greetStrings2.apply(i))

  }


}
