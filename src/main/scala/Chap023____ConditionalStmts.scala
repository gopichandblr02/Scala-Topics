class Chap023____ConditionalStmts
{
  def Chap023____ConditionalStmts(): Unit = {

//1. if Statement
//The if statement is used to execute a block of code when a given condition is true.
    
val x = 10
if (x > 0) {
println("x is positive")
}
    
//Output:
//x is positive
    
//2. if - else Statement
//If the condition in if is false, the else block executes.
    
val num = -5
if (num >= 0) {
println("Positive number")
} else {
println("Negative number")
}
//Output:
//Negative number
    
//3.if - else if - else Statement
//This is useful when multiple conditions need to be checked.
val score = 85
if (score >= 90) {
println("Grade: A")
} else if (score >= 80) {
println("Grade: B")
} else if (score >= 70) {
println("Grade: C")
} else {
println("Grade: F")
}
    
//Output:
//Grade: B
    
//4. if as an Expression
//Scala allows if statements to return values.
val a = 5
val b = 10
val max = if (a > b) a else b // Returns the larger number
println(s"Max value: $max")
//Output:
//Max value: 10
    
//5. match Statement
//(Scala's Alternative to switch)
//Scala provides match as a powerful alternative to switch.
    
val day = 3
val result = day match {
case 1 => "Monday"
case 2 => "Tuesday"
case 3 => "Wednesday"
case 4 => "Thursday"
case 5 => "Friday"
case 6 => "Saturday"
case 7 => "Sunday"
case _ => "Invalid day"
}
println(result)
//Output:
//Wednesday
    
//6. Pattern Matching with Conditions
//We can add conditions inside case statements.
val num1 = 10
num1 match {
case x if x > 0 => println("Positive number")
case x if x < 0 => println("Negative number")
case _ => println("Zero")
}
//Output:
//Positive number
    
//7.Nested
//if - else Statements Scala supports nested conditional statements.
    
val age = 18
if (age >= 18) {
if (age == 18) {
println("Just became an adult!")
} else {
println("You are an adult.")
}
} else {
println("You are a minor.")
}
    
//Output:
//Just became an adult !

  }
}
