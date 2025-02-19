class Chap011____Lists {
  //Scala Sets
  //  A Set in Scala is a collection of unique elements, meaning it does not allow duplicates. Sets can be either immutable (default) or mutable.
  //
  //1. Creating a Set
  //  (a) Immutable Set (Default)
  //Immutable sets cannot be modified after creation.

  val numbers = Set(1, 2, 3, 4, 5)
  println(numbers) // Output: Set(1, 2, 3, 4, 5)
  //(b) Mutable Set
  //Mutable sets allow adding and removing elements.


  import scala.collection.mutable
  val mutableSet = mutable.Set(1, 2, 3)
  mutableSet += 4 // Add an element
  mutableSet -= 2 // Remove an element
  println(mutableSet) // Output: Set(1, 3, 4)

  //2. Common Set Operations
  //  (a) Adding Elements
  //Immutable Set (creates a new set):
  val numbers1 = Set(1, 2, 3)
  val newNumbers = numbers1 + 4
  println(newNumbers) // Output: Set(1, 2, 3, 4)

  //Mutable Set (modifies in place):
  mutableSet += 5
  println(mutableSet) // Output: Set(1, 3, 4, 5)

  //(b) Removing Elements
  //Immutable Set:
  val numbers2 = Set(1, 2, 3, 4)
  val updatedNumbers = numbers2 - 2
  println(updatedNumbers) // Output: Set(1, 3, 4)

  //Mutable Set:
  mutableSet -= 3
  println(mutableSet) // Output: Set(1, 4, 5)

  //(c) Checking Membership
  val numbers3 = Set(1, 2, 3, 4)
  println(numbers3.contains(3)) // Output: true
  println(numbers3(5)) // Output: false

  //(d) Set Operations (Union, Intersection, Difference)
  //Union (++ or union)
  //Combines two sets:

  val setA = Set(1, 2, 3)
  val setB = Set(3, 4, 5)

  val unionSet = setA ++ setB
  println(unionSet) // Output: Set(1, 2, 3, 4, 5)

  //Intersection (& or intersect)
  //Finds common elements:
  //  
  val intersectionSet = setA & setB
  println(intersectionSet) // Output: Set(3)

  //Difference (-- or diff)
  //Elements in setA but not in setB:

  val differenceSet = setA -- setB
  println(differenceSet) // Output: Set(1, 2)

  //3. Iterating Over a Set
  //(a) Using foreach

  val numbers4 = Set(10, 20, 30)
  numbers4.foreach(num => println(num))

  //(b) Using for Loop
  for (num <- numbers4) println(num)

  //4. Converting a Set
  //  To List:
  val list = numbers4.toList

  //To Array:
  val array = numbers4.toArray

  //To String:
  val str = numbers4.mkString(", ")
  println(str) // Output: "10, 20, 30"

  //5. Immutable vs Mutable Sets
  //Feature	Immutable Set (Default)	Mutable Set
  //Modification	Returns new Set	Modifies in place
  //  Performance	More memory-efficient	Faster updates
  //Import Needed?	No	import scala.collection.mutable
  //6. Special Types of Sets
  //(a) Sorted Set
  //Automatically maintains elements in sorted order.


  import scala.collection.immutable.SortedSet

  val sortedNumbers = SortedSet(5, 3, 1, 4, 2)
  println(sortedNumbers) // Output: TreeSet(1, 2, 3, 4, 5)
  //(b) LinkedHashSet (Maintains Insertion Order)

  import scala.collection.mutable.LinkedHashSet

  val orderedSet = LinkedHashSet(3, 1, 4, 2)
  println(orderedSet) // Output: LinkedHashSet(3, 1, 4, 2)
  //7. Example: Word Frequency Counter Using Sets

  val text = "scala is fun and scala is powerful"
  val words = text.split(" ").toSet

  println(words) // Output: Set(scala, is, fun, and, powerful)

  //This removes duplicates automatically.
  //Key Takeaways
  //  ✅ Sets store only unique elements
  //  ✅ Immutable by default (use mutable.Set for modifications)
  //✅ Supports union (++), intersection (&), and difference (--)
  //  ✅ Useful for fast lookups (contains)
  //  ✅ Sorted and ordered sets are available for specific use cases

}