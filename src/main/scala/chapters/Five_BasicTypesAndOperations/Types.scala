package chapters.Five_BasicTypesAndOperations

/**
 * Created by Joan do Carmo on 23/12/15.
 */
object Types {

  def diferentTypes(): Unit = {

    val x = 2L
    val y: Long = 56
    val c: Short = 56

    //char
    val d = 'A'

    //char
    val e = '\101'

    //String Literals
    val hello = "hello"

    val escapes = "\\\"\'"
    println(escapes)

    //With """ we can put any character
    println( """Welcome to Ultamix 3000.
                Type "HELP" for help.""".stripMargin)

    //The issue is that the leading spaces before the second line are included in the string! To help with this
    // common situation, you can call stripMargin on strings. To use this method, put a pipe character ( | ) at the front of each line,
    //and then call stripMargin on the whole string:
    println( """|Welcome to Ultamix 3000.
                |Type "HELP" for help.""".stripMargin)


  }


}
