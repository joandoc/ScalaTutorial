package chapters.Two_FirstSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */

/**
 * methods
 * infered types
 * Unit
 */

object Functions {


  //Stats with def, parameters are not infered, so they must have their type.
  //And the return type is optional. Is obligatory when the function is recursive.
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  // The return type is inferred and if a function consists of just one statement, you can optionally leave off the curly braces.
  def max2(x: Int, y: Int) = if (x > y) x else y


  //Unit type is like java Void
  def callFunction(): Unit = {
    println(max(6, 23))
  }

}
