package chapters.Third_NextSteps

/**
 * Created by Joan do Carmo on 23/12/15.
 */
object SetAndMaps {

  //Creating, initializing, and using an immutable set.
  //The Scala compiler infers jetSet ’s type to be the immutable Set[String] .

  //To add a new element to a set, you call + on the set, passing in the new element. Both mutable and immutable sets offer
  // a + method, but their behavior differs. Whereas a mutable set will add the element to itself, an immutable
  //  set will create and return a new set with the element added.

  def createInmutableSet(): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

  }

  def createMutableSet(): Unit = {

    import scala.collection.mutable.Set
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

  }


  def createMutableMap(): Unit = {

    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
  }


  //when we use += we create a new map
  def createInmutableMap(): Unit = {

    var romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    romanNumeral += (6->"VI")
    println(romanNumeral(6))

  }


}
