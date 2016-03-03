import EigthFunctionAndClosures.Closures
import TenCompositionAndInheritance.ArrayElement

/**
  * Created by joan on 27/12/15.
  */
object Main extends App {


  Closures.creatingAClousure()
  println("------------------------------------")
  Closures.passClosureToMethod
  println("------------------------------------")
  Closures.passClosureToMethodTwo

  println("------------------------------------")
  val a = new ArrayElement(Array("aa", "bb"))
  println(a.height)

}
