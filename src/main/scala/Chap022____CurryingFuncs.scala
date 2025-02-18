class Chap022____CurryingFuncs
{
  
//Currying Functions
//A curried function takes multiple arguments as a chain of function calls.

def curriedAdd(x: Int)(y: Int): Int = x + y

val add5 = curriedAdd(5) _ // Partially applied function
println(add5(3)) // Output: 8
  
}



