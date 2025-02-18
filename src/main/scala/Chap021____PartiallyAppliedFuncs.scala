class Chap021____PartiallyAppliedFuncs
{

//Partially Applied Functions in Scala
//A partially applied function is a function that does not provide all its arguments upfront.Instead, it returns a
//new function with some parameters fixed, allowing for flexibility and reuse.
//
//1. Simple Example of a Partially Applied Function
//We can create a function with some arguments left unspecified and use _ as a placeholder.

def greet(prefix: String, name: String): String = s"$prefix $name"

val sayHello = greet("Hello", _) // Partially applied function
println(sayHello("Scala")) // Output: Hello Scala
println(sayHello("World")) // Output: Hello World

//How It Works
//greet takes two parameters: prefix and name.
//sayHello is a partially applied function where we provide
//"Hello" but leave name unspecified.
//We can later call sayHello("Scala") or any other name.

//2. Using Partially Applied Functions for Logging
//A common use case is creating a logging function.

def log(level: String, message: String): Unit = println(s"[$level] $message")

val infoLog = log("INFO", _: String) // Partially applied function
val errorLog = log("ERROR", _: String)

infoLog("Application started") // Output: [INFO] Application started
errorLog("Something went wrong") // Output: [ERROR] Something went wrong

//Why Use This ?
//It simplifies repetitive function calls.
//It improves readability and reuse.

//3. Using Partially Applied Functions with Higher - Order Functions

def multiply(a: Int, b: Int): Int = a * b

val double = multiply(2, _: Int) // Partially applied function
println(double(5)) // Output: 10
println(double(10)) // Output: 20

//4. Using _ to Create Partial Functions
//for Reducing Boilerplate

val addFive = (x: Int) => x + 5

val numbers = List(1, 2, 3, 4)
val incremented = numbers.map(addFive) // Apply function to all elements
println(incremented) // Output: List(6, 7, 8, 9)

//5. Partially Applied Function vs.Currying
//A curried function is naturally a chain of partially applied functions.

//Example of Currying


def curriedAdd(x: Int)(y: Int): Int = x + y

val addFiveVar = curriedAdd(5) _ // Partially applied
println(addFiveVar(10)) // Output: 15

//
//Key Takeaways
//✅ Partially applied functions allow reusability and flexibility.
//✅ They help simplify function calls by pre -filling some arguments.
//✅ Useful in logging, mathematical operations, and higher -order functions.
//✅ Closely related to currying, but different in syntax and behavior.



}
