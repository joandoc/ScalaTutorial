package Nine

/**
  * Created by joan on 27/12/15.
  *
  * curryng
  * new control structures
  *
  */
object Currying {


  def NonCurrying(): Unit = {

    def plainOldSum(x: Int, y: Int) = x + y
    plainOldSum(5, 6)

  }

  def currying(): Unit = {

    def add(x: Int) = (y: Int) => x + y
    add(1)(2)

  }


  def newControlStructure(): Unit = {

    def twice(op: Double => Double, x: Double) = op(op(x))
    twice((x: Double) => x + 1, 5)
    twice(_ + 1, 5)
  }


}
