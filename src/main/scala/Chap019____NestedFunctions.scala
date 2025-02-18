class Chap019____NestedFunctions {
  
//  Nested Functions
//  A function can be defined inside another function.
  
  def outerFunction(x: Int): Int = {
    def innerFunction(y: Int): Int = y * y
    innerFunction(x) + 10
  }

  println(outerFunction(5)) // Output: 35
}