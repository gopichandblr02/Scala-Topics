class Chap017____RecursionFunctions
{
//Recursion in Scala
//Recursion is a technique where a function calls itself to solve a problem.In Scala, recursion is an important concept, especially
//with functional programming, because it allows you to avoid mutable state and loops.

//1. Simple Recursion: A recursive function calls itself to compute the result.
//Example: Factorial Using Recursion
//

def factorial(n: Int): Int = {
if (n == 0) 1 // Base case
else n * factorial(n - 1) // Recursive case
}
println(factorial(5)) // Output: 120

//How it Works
//If n ==0, return 1(Base Case).
//Otherwise, return n * factorial(n - 1), making the problem smaller.

//2. Tail Recursion(Optimized Recursion)
//Scala optimizes tail - recursive functions using the @tailrec annotation from scala.annotation.tailrec.
//  This avoids stack overflow issues.

//Example: Factorial Using Tail Recursion

import scala.annotation.tailrec

def factorialTailRec(n: Int, acc: Int = 1): Int = {
if (n == 0) acc // Base case: return accumulator
else factorialTailRec(n - 1, n * acc) // Tail-recursive call
}

println(factorialTailRec(5)) // Output: 120

//Why Tail Recursion ?

//The recursive call is the last operation(tail position).
//The accumulator (acc) carries the result, avoiding deep recursion.
//The compiler optimizes it into a loop - like execution.


}
