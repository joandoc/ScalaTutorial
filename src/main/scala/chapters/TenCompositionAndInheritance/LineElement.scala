package TenCompositionAndInheritance

/**
  * Created by joan on 27/12/15.
  *
  * override
  *
  */
class LineElement(s: String) extends ArrayElement(Array(s)) {

  //Scala requires such a modifier for all members that  override a concrete member in a parent class. The modifier is optional if a
  //member implements an abstract member with the same name.
  override def width = s.length

  override def height = 1
}