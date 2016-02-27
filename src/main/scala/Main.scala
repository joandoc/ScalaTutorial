import java.util.{ResourceBundle => JResourceBundle}


/**
 * Created by Joan do Carmo on 14/12/15.
 */
object Main extends App {

  //  Variables.variables
  //  Functions.callFunction
  //  Iteration.whileIteration
  //  Iteration.forAndForeachIteration
  //
  //
  //
  //  Lists.creatingList()
  //  Lists.listOperators()
  //
  //  SetAndMaps.createMutableSet()
  //  SetAndMaps.createInmutableMap()

  //  Types.diferentTypes()
  //  ObjectEquality.equals
  //
  //  Rational.createRational()


  val a = new DynaA("aaaa")
  val b = List(new DynaA("bbbb"), new DynaA("fdsfds"))


  val c = a :: b
 val x = 2



}

class DynaA(a : String){}