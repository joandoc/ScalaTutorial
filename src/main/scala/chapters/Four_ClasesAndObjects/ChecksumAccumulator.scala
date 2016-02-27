package chapters.Four_ClasesAndObjects

/**
 * Created by Joan do Carmo on 23/12/15.
 */
class ChecksumAccumulator {
  var sum = 0
  private var sum2 = 2

  def add(b: Int): Unit = {
    sum += b
  }

}


//one way in which Scala is more object-oriented than Java is that classes in Scala cannot have static members. Instead, Scala
//has singleton objects.

//When a singleton object shares the same name with a class, it is called that class’s companion object.
//You must define both the class and its companion object in the same source file.

//A class and its companion object can access each other’s private members.

//One difference between classes and singleton objects is that singleton objects cannot take parameters

//A singleton object that does not share the same name with a companion class is called a standalone object.

object ChecksumAccumulator {

  val ca = new ChecksumAccumulator
  ca.sum
  ca.sum = 5
  ca.add(5)

  // puedo acceder al private member because is a companion object
  println(ca.sum2)

}