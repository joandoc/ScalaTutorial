package chapters.Six_FuncionalObject

/**
 * Created by Joan do Carmo on 23/12/15.
 */

/**
 * Constructor
 * Auxiliar contructor
 * precondition, require
 * this
 * override to string
 */


// n and d are classs parameters
//The primary constructor take this two parameters

class Rational(n: Int, d: Int) {

  //The require method takes one boolean parameter. If the passed value is true, require will return normally.
  // Otherwise, require will prevent the object from being constructed by throwing an IllegalArgumentException.
  //precondition of the primary constructor that d must be non-zero
  require(d != 0, "El denominador no puede ser 0")

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxiliary constructor

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )


  //this refers the object on which lessThan was invoked
  //You can also leave off the this prefix and write just numer
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  //override to String method
  override def toString = n + "/" + d

  // this line is in the primary contructor
  println("Created " + n + "/" + d)


}

object Rational {


  def createRational(): Unit = {

    try {
      val rat = new Rational(3, 0)
      println(rat.toString)
    } catch {
      case e: Throwable => println(e.getMessage)

    }

  }

}