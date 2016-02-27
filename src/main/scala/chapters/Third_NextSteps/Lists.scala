package chapters.Third_NextSteps

/**
 * Created by Joan do Carmo on 22/12/15.
 */

/**
 * Creating a List
 * Concatenate Two Lists, and generate new list
 * List methods
 *
 */

object Lists {

  //For an immutable sequence of objects that share the same type you can use Scala’s List class.

  //As with arrays, a List[String] contains only strings. Scala’s List , scala.List , differs from Java’s java.util.List
  //  type in that Scala List s are always immutable

  def creatingList(): Unit = {

    val oneTwoThree = List(1, 2, 3)
    // because List s are immutable, they behave a bit like Java strings: when you call a method on a list that might seem
    // by its name to imply the list will mutate, instead creates and returns a new list with the new value. For example, List
    //has a method named ‘ ::: ’ for list concatenation.

    //Here we create  2 lists. And when we reasing oneTwo a new List is created
    var oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    oneTwo = oneTwo ::: threeFour
    println("oneTwo " + oneTwo + " and " + "threeFour " + threeFour)
  }

  def listOperators(): Unit = {

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    //Concat Two List, it creates a new list
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)

    //prepends a new element to the beginning of an existing list
    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    //If the method name ends in a colon, the method is invoked on the right operand. Therefore, in 1 :: twoThree , the :: method
    //is invoked on twoThree , passing in 1 , like this: twoThree.::(1) .

    //Given that a shorthand way to specify an empty list is Nil


    /*---------------------------------------------------------------------------------------------------------------------*/

    val emptyList = List()
    val otherEmptyList = Nil

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Other way to initialize list. We apply :: To Nil, that is an empty List
    val thrill = "Will" :: "fill" :: "until" :: Nil

    /*---------------------------------------------------------------------------------------------------------------------*/
    //Concatenates two Lists and return a new list.
    List("a", "b") ::: List("c", "d")

    /*---------------------------------------------------------------------------------------------------------------------*/

    thrill(2) //Returns the element at index 2 (until)

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Counts the number of string elements in thrill that have length 4
    thrill.count(s => s.length == 4)

    /*---------------------------------------------------------------------------------------------------------------------*/

    thrill.drop(2) //Returns the thrill list without its first 2 elements (returns List("until") )

    thrill.dropRight(2) //Returns the thrill list without its rightmost 2 elements (returns List("Will") )

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Determines whether a string element exists in thrill that has the value "until" (returns true )
    thrill.exists(s => s == "until")

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Returns a list of all elements, in order, of the thrill list that have length 4 (returns List("Will", "fill") )
    thrill.filter(s => s.length == 4)

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Indicates whether all elements in the thrill list end with the letter "l" (returns true )
    thrill.forall(s => s.endsWith("l"))

    /*---------------------------------------------------------------------------------------------------------------------*/

    //Executes the print statement on each of the strings in the thrill list (prints "Willfilluntil" )
    thrill.foreach(s => println(s))

    /*---------------------------------------------------------------------------------------------------------------------*/

    thrill.init // Returns a list of all but the last element in the thrill list (returns List("Will", "fill") )
    thrill.head //Returns the first element in the thrill list (returns "Will" )
    thrill.isEmpty //Indicates whether the thrill list is empty (returns false )
    thrill.last //Returns the last element in the thrill list (returns "until" )
    thrill.length // Returns the number of elements in the thrill list (returns 3)

    //Returns a list resulting from adding a "y" to each string element in the thrill list  (returns List("Willy", "filly", "untily") )
    thrill.map(s => s + "y")

    //Makes a string with the elements of the list (returns "Will, fill, until" )
    thrill.mkString(", ")

    //Returns a list of all elements, in order, of the thrill list except those that have length 4 (returns List("until") )
    //thrill.remove(s => s.length == 4)

    //Returns a list containing all elements of the thrill list in reverse order (returns List("until", "fill", "Will") )
    thrill.reverse

    //Returns a list containing all elements of  the thrill list in alphabetical order of the first character lowercased (returns List("fill", "until", "Will") )
    //thrill.sort((s, t) => s.charAt(0).toLower <  t.charAt(0).toLower)

    thrill.tail
    //Returns the thrill list minus its first element (returns List("fill", "until") )

  }


}
