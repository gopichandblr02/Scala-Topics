class Person(var name: String, var age: Int) {
  def greet(): Unit = {
    println(s"Hello, my name is $name, and I am $age years old.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val person1 = new Person("Alice", 30)

    person1.greet()
  }
}
/*
In the above program, these are various identifiers −

Person − Class name
  person1 − Object name
  Main − Object name
  main − Method name
  args − Variable name
  Types of Scala Identifiers
  All Scala components require names. Names used for objects, classes, variables and methods are called identifiers. 
  A keyword cannot be used as an identifier and identifiers are case-sensitive. Scala supports four types of identifiers.

1. Alphanumeric Identifiers
These identifiers start with a letter (lowercase or uppercase) or an underscore and followed by digits, letters and underscores.
 For example, _Name, _name, name123, _1_name_23, name etc. are valid Alphanumeric identifiers. Whereas, 123name, $name,
 -name etc are invalid identifiers in Scala.
*/
