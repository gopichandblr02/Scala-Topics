class Chap012____Maps{


//Maps in Scala
//A Map in Scala is a collection of key-value pairs. Each key maps to a unique value, and duplicate keys are not allowed.
//
//Scala provides two types of Maps:
//
//  Immutable Maps (default)
//Mutable Maps (modifiable)
//1. Creating a Map
//  (a) Immutable Map (Default)
//Immutable maps cannot be modified after creation.


val myMap = Map("a" -> 1, "b" -> 2, "c" -> 3)
println(myMap)  // Output: Map(a -> 1, b -> 2, c -> 3)

//(b) Mutable Map
//Mutable maps allow modifications.

import scala.collection.mutable
val mutableMap = mutable.Map("x" -> 10, "y" -> 20)
mutableMap += ("z" -> 30)  // Adding an element
mutableMap -= "x"         // Removing an element
println(mutableMap)  // Output: Map(y -> 20, z -> 30)

//2. Accessing Values
//(a) Using get Method

val myMap1 = Map("a" -> 1, "b" -> 2)

println(myMap1.get("a"))  // Output: Some(1)
println(myMap1.get("x"))  // Output: None

//(b) Using getOrElse (To Avoid None)

println(myMap1.getOrElse("b", 0))  // Output: 2
println(myMap1.getOrElse("x", 0))  // Output: 0

//(c) Direct Key Access (Throws Exception if Key Not Found)

println(myMap1("a"))  // Output: 1
// println(myMap("x"))  // Throws NoSuchElementException

//3. Adding and Removing Elements
//(a) Immutable Map (Creates a New Map)

val myMap2 = Map("a" -> 1, "b" -> 2)
val updatedMap = myMap2 + ("c" -> 3)  // Adding an entry
println(updatedMap)  // Output: Map(a -> 1, b -> 2, c -> 3)

//(b) Mutable Map (Modifies in Place)

mutableMap += ("d" -> 40)  // Add element
mutableMap -= "y"         // Remove element
println(mutableMap)  // Output: Map(z -> 30, d -> 40)

//4. Iterating Over a Map
//(a) Using foreach

val myMap3 = Map("a" -> 1, "b" -> 2)
myMap.foreach { case (key, value) => println(s"Key: $key, Value: $value") }

//(b) Using for Loop

  for ((key, value) <- myMap3) {
    println(s"Key: $key, Value: $value")
  }

//5. Checking for Keys and Values

val myMap4 = Map("a" -> 1, "b" -> 2)
println(myMap4.contains("a"))  // Output: true
println(myMap4.contains("z"))  // Output: false

//6. Merging Two Maps

val map1 = Map("a" -> 1, "b" -> 2)
val map2 = Map("b" -> 3, "c" -> 4)
val mergedMap = map1 ++ map2
println(mergedMap)  // Output: Map(a -> 1, b -> 3, c -> 4)  (map2's "b" overwrites map1's "b")

//7. Special Types of Maps
//(a) SortedMap (Sorted by Key)

import scala.collection.immutable.SortedMap
val sortedMap = SortedMap(3 -> "Three", 1 -> "One", 2 -> "Two")
println(sortedMap)  // Output: Map(1 -> One, 2 -> Two, 3 -> Three)

//(b) LinkedHashMap (Maintains Insertion Order)

import scala.collection.mutable.LinkedHashMap

val linkedMap = LinkedHashMap("one" -> 1, "two" -> 2, "three" -> 3)
println(linkedMap)  // Output: Map(one -> 1, two -> 2, three -> 3)

//8. Example: Word Count Using Maps

val text = "scala is fun and scala is powerful"
val words = text.split(" ")

val wordCount = words.groupBy(identity).mapValues(_.size)

println(wordCount)
// Output: Map(scala -> 2, is -> 2, fun -> 1, and -> 1, powerful -> 1)
//Key Takeaways
//  ✅ Maps store key-value pairs
//  ✅ Immutable by default (use mutable.Map for modifications)
//✅ Use getOrElse to avoid None when accessing elements
//  ✅ Supports merging, iteration, and key/value checking
//  ✅ Different types like SortedMap and LinkedHashMap available


}