class chap008____FoldLeftRight {

  //foldLeft and foldRight in Scala
  //In Scala, foldLeft and foldRight are higher-order functions used for reducing a collection (like a List or Seq) into a 
  // single value by applying a function iteratively.
  //
  //1. foldLeft in Scala
  //  Syntax : collection.foldLeft(initialValue)(operation)
  //Processes elements from left to right.
  //The initial value is applied first.
  //Useful when you need to maintain order while accumulating results.
  //Example: Sum of a List Using foldLeft

  val numbers = List(1, 2, 3, 4, 5)
  val sum = numbers.foldLeft(0)((acc, num) => acc + num)

  println(sum) // Output: 15
  //How It Works
  //Step	    Accumulator (acc)	    Current Element (num)	    Result
  //1	                  0	                1	                    1
  //2	                  1	                2	                    3 
  //3	                  3	                3 	                  6
  //4	                  6	                4	                    10
  //5	                  10	              5	                    15

  //  2. foldRight in Scala
  //  Syntax:  collection.foldRight(initialValue)(operation)
  //Processes elements from right to left.
  //The initial value is applied at the end.
  //Useful when working with lists (since they are optimized for right-recursive operations).
  //Example: Sum of a List Using foldRight

  val numbers1 = List(1, 2, 3, 4, 5)
  val sum1 = numbers1.foldRight(0)((num, acc) => num + acc)
  println(sum1) // Output: 15

  //  How It Works
  //Step	      Current Element (num)	      Accumulator (acc)	      Result 
  //  1	          5	                            0	                    5
  //  2	          4	                            5	                    9
  //  3	          3	                            9	                    12
  //  4	          2	                            12	                  14
  //  5	          1	                            14	                  15


  //3. Key Differences Between foldLeft and foldRight
  //Feature	foldLeft	foldRight
  //Processing Order	Left to Right (Head → Tail)	Right to Left (Tail → Head)
  //Performance	More efficient for Lists, as :: is fast for right-associative operations	Less efficient for Lists, as 
  //  foldRight can cause stack overflow if not tail-recursive
  //  Use Case	When order matters or when working with List, Vector, or ArrayBuffer	When working with recursive structures like linked lists
  //4. Examples of foldLeft and foldRight
  //  (a) String Concatenation
  //Using foldLeft:

  val words = List("Scala", "is", "awesome")
  val sentence = words.foldLeft("")((acc, word) => acc + " " + word)
  println(sentence.trim) // Output: Scala is awesome

  //  Using foldRight:
  val sentenceRight = words.foldRight("")((word, acc) => word + " " + acc)
  println(sentenceRight.trim) // Output: Scala is awesome

  //(b) Reversing a List
  //  Using foldLeft:

  val numbers2 = List(1, 2, 3, 4, 5)
  val reversed = numbers2.foldLeft(List[Int]())((acc, num) => num :: acc)
  println(reversed) // Output: List(5, 4, 3, 2, 1)

  //Using foldRight:

  val reversedRight = numbers.foldRight(List[Int]())((num, acc) => acc :+ num)
  println(reversedRight) // Output: List(1, 2, 3, 4, 5)

  //(c) Finding Maximum in a List

  val numbers3 = List(10, 20, 5, 40, 25)
  val maxNum = numbers3.foldLeft(Int.MinValue)((max, num) => if (num > max) num else max)
  println(maxNum) // Output: 40

  //5. When to Use foldLeft vs. foldRight? 
  //  ✅ Use foldLeft when working with Lists, Arrays, and performance-sensitive operations.
  //✅ Use foldRight for recursive structures where right-associativity makes sense.
  //✅ Use foldLeft when modifying an accumulator, as it avoids deep recursion.

}