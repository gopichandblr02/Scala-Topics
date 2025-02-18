Scala provides various data types that can be categorized into the following groups:

1. Numeric Data Types
   Byte: 8-bit signed integer

```
val a: Byte = 100
```

Short: 16-bit signed integer

```
val b: Short = 20000
```

Int: 32-bit signed integer

```
val c: Int = 100000
```

Long: 64-bit signed integer

```
val d: Long = 10000000000L
```

Float: 32-bit floating point

```
val e: Float = 10.5f
```

Double: 64-bit floating point
```
val f: Double = 99.99
```



2. Character Data Type
   Char: Represents a single 16-bit Unicode character

```
val g: Char = 'A'
```


3. Boolean Data Type
   Boolean: Represents true or false

```
val h: Boolean = true
```

4. String Data Type
   String: Sequence of characters

```
val i: String = "Hello, Scala!"
```
   
5. Unit, Null, Nothing
   Unit: Represents no value, similar to void in Java

```
def printMessage(): Unit = println("This is a message")
```

Null: A null reference (only for reference types, not primitives)

```
val j: String = null
```

Nothing: Subtype of all types, often used for functions that never return normally

```
def throwError(): Nothing = throw new Exception("This is an error")
```

6. Any and AnyVal/AnyRef
   Any: The supertype of all types in Scala
   AnyVal: The supertype of all value types (Int, Double, etc.)
   AnyRef: The supertype of all reference types (like Java objects)

```
val k: Any = 42
val l: AnyRef = "Scala Reference"
```

