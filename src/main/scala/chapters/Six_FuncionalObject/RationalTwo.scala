package chapters.Six_FuncionalObject

import ImplicitConversion.intToRational
/**
 * Created by Joan do Carmo on 23/12/15.
 */

/**
 * Private fields and methods
 * Defining operators
 * Implicit Conversion
 */


// n and d are classs parameters
//The primary constructor take this two parameters

class RationalTwo(n: Int, d: Int) {

  //The require method takes one boolean parameter. If the passed value is true, require will return normally.
  // Otherwise, require will prevent the object from being constructed by throwing an IllegalArgumentException.
  //precondition of the primary constructor that d must be non-zero
  require(d != 0, "El denominador no puede ser 0")

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxiliary constructor

  def +(that: RationalTwo): RationalTwo =
    new RationalTwo(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )


  //this refers the object on which lessThan was invoked
  //You can also leave off the this prefix and write just numer
  def lessThan(that: RationalTwo) =
    this.numer * that.denom < that.numer * this.denom


  def *(that: RationalTwo): RationalTwo =
    new RationalTwo(numer * that.numer, denom * that.denom)

  def *(i: Int): RationalTwo =
    new RationalTwo(numer * i, denom)

  //override to String method
  override def toString = n + "/" + d

  // this line is in the primary contructor
  println("Created " + n + "/" + d)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


}

object RationalTwo {

  def createRational(): Unit = {

    try {
      val rat = new RationalTwo(3, 4)
      val rat2 = new RationalTwo(3, 5)
      val rat3 = rat + rat2


      //Using implicit Conversion defined in ImplicitConversion object
      val ratWithImplicitConversion = 2 * rat

      println(rat3)
    } catch {
      case e: Throwable => println(e.getMessage)

    }

  }

}