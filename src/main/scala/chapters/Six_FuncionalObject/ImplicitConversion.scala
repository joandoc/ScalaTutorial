package chapters.Six_FuncionalObject

/**
 * Created by Joan do Carmo on 23/12/15.
 */
object ImplicitConversion {

  //Implicit conversion that automatically converts integers to rational numbers when needed
  implicit def intToRational(x: Int) = new RationalTwo(x)


}
