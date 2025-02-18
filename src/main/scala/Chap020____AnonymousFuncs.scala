class Chap020____AnonymousFuncs
{
//Anonymous Functions(Lambdas)
//Scala supports anonymous functions (functions without a name) using =>.
  
val multiply = (x: Int, y: Int) => x * y
println(multiply(3, 4)) // Output: 12

//Shorter syntax using underscore (_):
  
val multiplyShort: (Int, Int) => Int = _ * _
println(multiplyShort(3, 4)) // Output: 12
  
}


