package chapters.Five_BasicTypesAndOperations

/**
 * Created by Joan do Carmo on 23/12/15.
 */
object ObjectEquality {

  def equals: Unit = {

    println(1 == 2)

    //These operations actually apply to all objects, not just basic types. For example, you can use == to compare lists:
    println(List(1, 2, 3) == List(1, 2, 3))

    //Going further, you can compare two objects that have different types:
    println(1 == 1L)

    println(List(1, 2, 3) == null)
    println(null == List(1, 2, 3))

    //As you see, == has been carefully crafted so that you get just the equality comparison you want in most cases.
    //This is accomplished with a very simple rule: first check the left side for null , and if it is not null , call the equals method.


  }


}
