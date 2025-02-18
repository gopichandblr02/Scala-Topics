class Chap018____HigherOrderFunctions
{

// Higher -Order Functions
//  A higher -order function takes another function as a parameter or returns a function.
//Example: Passing a Function as an Argument
    
def operateOnNumbers(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
  operation(x, y)
}

val sum = (a: Int, b: Int) => a + b
val product = (a: Int, b: Int) => a * b

println(operateOnNumbers(4, 5, sum)) // Output: 9
println(operateOnNumbers(4, 5, product)) // Output: 20
  }




