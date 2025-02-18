class Chap022____Loops
{
  def Loops(): Unit = {
//Loops in Scala allow you to execute a block of code multiple times.Scala provides several looping constructs
//, including while, do - while, and for loops.
    
//1. while Loop: The while loop executes a block of code as long as the condition remains true.
var i = 1
while (i <= 5) {
println(s"Iteration: $i")
i += 1
}
//Output:
//Iteration: 1
//Iteration: 2
//Iteration: 3
//Iteration: 4
//Iteration: 5
    
//2. do - while Loop: The do - while loop ensures the block executes at least once, even if the condition is false.
    // deprecated
    
//3. for Loop :The for loop in Scala is more powerful and flexible compared to other languages.
//(a) Looping Over a Range

for (i <- 1 to 5) { // Includes 5
println(s"Iteration: $i")
}
//Output:
//Iteration: 1
//Iteration: 2
//Iteration: 3
//Iteration: 4
//Iteration: 5
    
//Using until (excludes the upper bound):

for (i <- 1 until 5) { // Excludes 5
println(s"Iteration: $i")
}
//Output:
//Iteration: 1
//Iteration: 2
//Iteration: 3
//Iteration: 4
    
//(b) Looping Over Collections
val fruits = Array("Apple", "Banana", "Cherry")
for (fruit <- fruits) {
println(fruit)
}
//Output:
//Apple
//Banana
//Cherry
    
//(c) Using yield to Return a New Collection
val squares = for (i <- 1 to 5) yield i * i
println(squares) // Output: Vector(1, 4, 9, 16, 25)
    
//(d) Using for with Conditions(Filtering)
for (i <- 1 to 10 if i % 2 == 0) {
println(i) // Prints only even numbers
}
//Output:
//2
//4
//6
//8
//10
    
//(e) Nested for Loops
for (i <- 1 to 3; j <- 1 to 3) {
println(s"i = $i, j = $j")
}
//Output:
//i = 1
//, j = 1
//i = 1
//, j = 2
//i = 1
//, j = 3
//i = 2
//, j = 1
//i = 2
//, j = 2
//i = 2
//, j = 3
//i = 3
//, j = 1
//i = 3
//, j = 2
//i = 3
//, j = 3
    
//(f) Loop with Multiple Generators

for (x <- 1 to 3; y <- 1 to 3 if x != y) {
println(s"x = $x, y = $y")
}
//Output:
//x = 1
//, y = 2
//x = 1
//, y = 3
//x = 2
//, y = 1
//x = 2
//, y = 3
//x = 3
//, y = 1
//x = 3
//, y = 2
    
//4. Breaking and Continuing Loops Scala does not have break or continue statements like Java
//, but we can use breakable from scala.util.control.Breaks.

import scala.util.control.Breaks._
    
breakable {
for (i <- 1 to 10) {
if (i == 5) break // Exits the loop when i == 5
println(i)
}
}
//Output:
//1
//2
//3
//4


  }



}


