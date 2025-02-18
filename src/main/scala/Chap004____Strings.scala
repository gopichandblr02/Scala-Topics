class Chap004____Strings
{
  def Strings(): Unit = {
    /*
Scala Strings
In Scala
, a String is a sequence of characters and is immutable
, meaning it cannot be changed once created.Scala strings are represented by the String
class, which is part of Java’s
java.lang.String.
*/
    
//    1. Creating Strings
//    Using String Literals

    val str1: String = "Hello, Scala!"
    println(str1) // Output: Hello, Scala!
    
//    Using new Keyword

    val str2 = new String("Welcome to Scala")
    println(str2) // Output: Welcome to Scala
    
//    2. String Interpolation
//    Scala provides string interpolation to embed variables inside strings.
//    (a) s Interpolator(Simple variable substitution)
    val name = "John"
    val age = 25
    val greeting = s"My name is $name and I am $age years old."
    println(greeting) // Output: My name is John and I am 25 years old.
    
//    (b) f Interpolator(Formatted strings)
    val pi = 3.14159
    val formatted = f"Value of Pi is $pi%.2f"
    println(formatted) // Output: Value of Pi is 3.14
    
//    (c) raw Interpolator(Ignores escape characters)
    val rawString = raw"Hello\nScala"
    println(rawString) // Output: Hello\nScala
    
//    3. String Operations
//    (a) Concatenation
    val str3 = "Hello" + " " + "World"
    println(str3) // Output: Hello World
    
//    or using concat()
    val str4 = "Hello".concat(" Scala")
    println(str4) // Output: Hello Scala
    
//    (b) Accessing Characters
    val str5 = "Scala"
    println(str5(0)) // Output: S
    println(str5.charAt(2)) // Output: a
    
//    (c) Length of a String
    val str6 = "Functional Programming"
    println(str6.length) // Output: 22
    
//    (d) Comparing Strings
    val str7 = "Scala"
    val str8 = "scala"
    println(str7 == str8) // Output: false (case-sensitive comparison)
    println(str7.equalsIgnoreCase(str8)) // Output: true (case-insensitive comparison)
    
//    (e) Substring
    val str9 = "Hello, Scala!"
    println(str9.substring(7, 12)) // Output: Scala
    
//    (f) String Split
    val sentence = "Scala is powerful"
    val words = sentence.split(" ")
    words.foreach(println)
    // Output:
    // Scala
    // is
    // powerful
    
//    (g) String Replace
    val str10 = "I love Java"
    println(str10.replace("Java", "Scala")) // Output: I love Scala
    
//    (h) Converting Case
    val str11 = "Hello World"
    println(str11.toUpperCase) // Output: HELLO WORLD
    println(str11.toLowerCase) // Output: hello world
    
//    (i) Checking
//    if String Contains a Substring
    val str12 = "Learning Scala"
    println(str12.contains("Scala")) // Output: true
    
//    4. Multiline Strings
//    Scala allows defining multiline strings using triple double -quotes """ """.
    
    val multiLineString =
      """This is a
        |multiline
        |string in Scala.""".stripMargin
    println(multiLineString)
//    Output:
//    This is a
//    multiline
//    string in Scala.
  }

}

