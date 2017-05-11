package com.funcoming.niubi

/**
  * @author ${user.name}
  */
object App {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + foo(args))
    val dinggou = (4, "定制", 5, "办理")
    dinggou.productIterator.foreach {
      dg => println(dg)
    }
    val string = dinggou.productIterator.mkString("|")
    println("jiguoshi " + string)
    val xx = "\\N|\\N|\\N|\\N|\\N|\\N|\\N|\\N"
    if (xx.equals("\\N|\\N|\\N|\\N|\\N|\\N|\\N|\\N")) {
      println("成功了")
    }


  }


}
