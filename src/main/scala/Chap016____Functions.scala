class Chap016____Functions
{
  def Chap016____Functions(): Unit = {
   
//Functions and Methods in Scala
//In Scala, both functions and methods allow us to encapsulate logic for reuse.While they are similar
//, there are key differences in how they are defined and used.
//
//1. Methods in Scala: A method in Scala is a function that belongs to an object or class and is defined using def.
//Example of a Simple Method


def greet(name: String): String = {
  return s"Hello, $name!"
}
println(greet("Scala")) // Output: Hello, Scala!
    
//Key Characteristics of Methods : 
//Defined using def.
//Can have an explicit return type.
//The return keyword is optional(Scala automatically returns the last expression).
    
//2. Functions in Scala A function in Scala is a first - class citizen
//, meaning it can be assigned to variables
//, passed as arguments
//, and returned from other functions.

//  Function as a Value

val square: Int => Int = (x: Int) => x * x
println(square(4)) // Output: 16
    
//Key Characteristics of Functions :
//Functions can be stored in variables.
//Defined using lambda expressions (x: Int) => x * x.
//Can be passed as arguments to higher - order functions.
    
//3. Function vs.Method Differences 
    
//Feature                               Method                      Function
//Defined with                          def                       val, var, or def (as a function literal)
//Belongs to                            A class /object           A variable
//Can be assigned to a variable         No                        Yes 
//  Supports higher -order functions    No                        Yes
    
    
//    Example Showing the Difference
    
// Method
def addMethod(x: Int, y: Int): Int = x + y

// Function assigned to a variable
val addFunction: (Int, Int) => Int = (x, y) => x + y

println(addMethod(2, 3)) // Output: 5
println(addFunction(2, 3)) // Output: 5
    
//8. Default and Named Parameters
//(a) Default Parameters
    
//def greet(name: String = "Guest"): String = s"Hello, $name!"
//println(greet()) // Output: Hello, Guest!
//println(greet("John")) // Output: Hello, John!
    
//(b) Named Parameters

def printDetails(name: String, age: Int): Unit = {
  println(s"Name: $name, Age: $age")
}
printDetails(age = 25, name = "Alice")
    
//Output:
//Name: Alice
//, Age: 25
    
//9. Function Composition
//Functions can be combined using and Then and compose.

val addTwo: Int => Int = _ + 2
val squareFunc: Int => Int = x => x * x

val addThenSquare = addTwo andThen squareFunc
val squareThenAdd = addTwo compose squareFunc

println(addThenSquare(3)) // Output: 25
println(squareThenAdd(3)) // Output: 11

  }

}
