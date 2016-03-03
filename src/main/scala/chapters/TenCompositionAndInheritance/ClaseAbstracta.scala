package TenCompositionAndInheritance

/**
  * Created by joan on 27/12/15.
  */

/**
  * clase abstracta
  * parameterless methods
  * empty-params methods
  * final
  */


//class with abstract members must itself be declared abstract
//The abstract modifier signifies that the class may have abstract members that do not have an implementation.
abstract class ClaseAbstracta {

  val x = 2
  val y: Int

  def contents: Array[String]

  // Such parameterless methods are quite common in Scala. By contrast, methods defined with empty parentheses, such as
  // def height(): Int , are called empty-paren methods. The recommended convention is to use a parameterless method whenever
  // there are no parameters and the method accesses mutable state only by reading fields of the containing object (in particular, it
  // does not change mutable state).
  def height: Int = contents.length

  def width(): Int = 24

  final def noOverradiable(): Unit ={
    println("este metodo no se puede overridear")
  }

}
