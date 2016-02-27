package chapters.Third_NextSteps

/**
 * Created by Joan do Carmo on 23/12/15.
 */
object Tuples {

  //Like lists, tuples are immutable, but unlike lists, tuples can contain different types of elements.
  //Tuples are very useful, for example, if you need to return multiple objects from a method.

  def createTuple(): Unit ={

    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)

  }


}
