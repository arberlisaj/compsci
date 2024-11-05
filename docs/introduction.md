# Introduction

Java is a versatile, high-level programming language designed for portability, performance, and security. With its "write once, run anywhere" capability, it powers applications across various platforms, making it popular for web, mobile, and enterprise development.

## Data Types

Primitive types in Java are the basic data types that represent single values and are not objects. They are predefined by the Java language and serve as the building blocks for data manipulation. There are eight primitive types in Java.

Reference Data Types in Java are types that refer to objects and can be used to store references to complex data structures. Reference types include (Classes, Interfaces, Arrays and Enums).

## Primitive Types

Java primitive data types represented as a table including their sizes, default values, and ranges

| **Type**  | **Size**        | **Default Value** | **Range**                                                   |
| --------- | --------------- | ----------------- | ----------------------------------------------------------- |
| `byte`    | 8-bit           | `0`               | `-128` to `127`                                             |
| `short`   | 16-bit          | `0`               | `-32,768` to `32,767`                                       |
| `int`     | 32-bit          | `0`               | `-2,147,483,648` to `2,147,483,647`                         |
| `long`    | 64-bit          | `0L`              | `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807` |
| `float`   | 32-bit          | `0.0f`            | `±3.40282347E+38F`                                          |
| `double`  | 64-bit          | `0.0d`            | `±1.79769313486231570E+308`                                 |
| `char`    | 16-bit          | `'\u0000'`        | `'\u0000'` to `'\uffff'` (0 to 65,535)                      |
| `boolean` | 8-bits (varies) | `false`           | `true` or `false`                                           |

## Getting Started

**Strings** are a sequence of characters used to represent text. They are objects of the String class, which is part of the java.lang package. Here’s an overview of how strings work in Java:

```Java
/*
Strings are immutable sequences of characters, supported by a rich set of
methods for manipulation. For performance-critical applications,
StringBuilder and StringBuffer can be used to manage mutable strings.
*/
String string1 = "Hello World!";
String string2 = new String("Hello World!");

// Common String Methods
int length = string1.length(); // Returns string length.
// Concatenation
String combined = string1 + string2; // Combines the two strings.
// Substring
String substring = string1.substring(0,5); // Extracts a substring.
// Character Access
char character = string1.charAt(0); // Accesses a specific character.
// Comparison
boolean isEqual = string1.equals(string2); // Compares the two strings.
// Index of
int idx = string1.indexOf("World"); // Finds the index of a substring.
// Conversion
String upperCaseString = string1.toUpperCase(); // Converts to uppercase
String lowerCaseString = string2.toLowerCase(); // Converts to lowercase

// StringBuilder - mutable string operations
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```

**Escape sequences** are essential for formatting strings in Java, allowing you to include special characters and control formatting in output. They enhance the readability and functionality of string manipulation in your code.

```Java
System.out.println("Hello, World!");                      // Regular string
System.out.println("This is a tab:\tTabbed text.");       // Using \t for a tab
System.out.println("This is on a new line:\nNext line."); // Using \n for a new line
System.out.println("Quotes: \"Hello, World!\"");          // Using \" for double quotes
System.out.println("Backslash: \\");                      // Using \\ for a backslash
```

**Arrays** in Java are a powerful and essential data structure for storing collections of data. They provide fixed-size storage, are easy to access using indexes, and support iteration, making them useful for various applications in programming.

```Java
// Declaration with initialization
int[] numbers = {1, 2, 3, 4, 5};

// Specifying values after declaration
String[] fruits = new String[3];
fruits[0] = "Apple";
fruits[1] = "Banana";
fruits[2] = "Cherry";
```

**Multidimensional arrays** provide a flexible way to store and manage complex data structures, such as matrices or grids. They are accessed and manipulated using multiple indices and are particularly useful for applications in mathematics, graphics, and simulations.

```Java
// Declaration of a 2D Array
int[][] matrix;

// Direct initialization
int[][] matrix = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};

// Creating a new instance
int[][] matrix = new int[3][3];
```

**Constants** in Java are immutable values that enhance code readability and maintainability. By using the final keyword, you can create constants that cannot be changed, allowing for clearer and more predictable code. Enums are another way to define fixed sets of constants in Java.

```Java
// Syntax
final dataType CONSTANT_NAME = value;
```

**Arithmetic expressions** in Java are fundamental for performing mathematical calculations. They use various operators to manipulate numeric data and follow specific rules of precedence. Understanding how to use these operators effectively can enhance your ability to write clear and efficient Java code.

```Java
// Operator Precedence () -> *,/,% -> + and -

int a = 10;
int b = 5;

// Basic arithmetic operations
int sum = a + b;               // Addition
int difference = a - b;        // Subtraction
int product = a * b;           // Multiplication
int quotient = a / b;          // Division
int remainder = a % b;         // Modulus

int c = 5;
System.out.println("Post-increment: " + c++);
System.out.println("Value after post-increment: " + c);
System.out.println("Pre-decrement: " + --c);
```

**Type casting** is essential for type conversion in Java, with implicit casting being automatic and explicit casting requiring a manual cast to avoid data loss.

```Java
// Implicit casting
int num = 10;
long longNum = num;

// Explicit casting or narrowing (intNum becomes 9)
double decimalNum = 9.78;
int intNum = (int) decimalNum;

// Object casting
Animal animal = new Dog(); // Upcasting
Dog dog = (Dog) animal; // Downcasting
```

The **Math** class is essential for performing calculations in Java, offering methods for arithmetic, trigonometry, and generating random numbers.

```Java
// Absolute value
System.out.println("Absolute: " + Math.abs(-10)); // 10

// Square root
System.out.println("Square root: " + Math.sqrt(16)); // 4.0

// Power
System.out.println("Power: " + Math.pow(2, 3)); // 8.0

// Maximum and Minimum
System.out.println("Max: " + Math.max(5, 10)); // 10
System.out.println("Min: " + Math.min(5, 10)); // 5

// Random number
System.out.println("Random: " + Math.random()); // Random value between 0.0 and 1.0

// Trigonometric functions
double angle = 30;
System.out.println("Sin: " + Math.sin(Math.toRadians(angle))); // 0.5
System.out.println("Cos: " + Math.cos(Math.toRadians(angle))); // 0.866
```

**Formatting Numbers** using classes like DecimalFormat, String.format, and NumberFormat. These methods help present numbers clearly for users, whether in decimal, currency, or percentage format.

```Java
double number = 1234567.89;

// DecimalFormat
DecimalFormat df = new DecimalFormat("#,###.00");
df.format(number); // 1,234,567.89

// String.format
String.format("%.2f", number); // 123.46
String.format("$%,.2f", number); // $123.46

// NumberFormat
NumberFormat numberFormat = NumberFormat.getInstance();
System.out.println("Number: " + numberFormat.format(number)); // 12,345.679
NumberFormat.getCurrencyInstance(); // $12,345.68
NumberFormat.getPercentInstance(); // 85%
```

**Reading input** from the user can be done using various methods. The most common ways are through the Scanner class and the BufferedReader class. Below are some examples demonstrating how to use these methods.

```Java
// Using Scanner
Scanner scanner = new Scanner(System.in);

// Reading a string
System.out.print("Enter your name: ");
String name = scanner.nextLine();

// Reading an integer
System.out.print("Enter your age: ");
int age = scanner.nextInt();

// Reading a double
System.out.print("Enter your height (in meters): ");
double height = scanner.nextDouble();

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Height: " + height + " m");

// Close the scanner
scanner.close();

// ----------------------------------------------------
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

try {
  System.out.print("Enter your name: ");
  String name = reader.readLine();

  System.out.print("Enter your age: ");
  int age = Integer.parseInt(reader.readLine());

  // Reading a double
  System.out.print("Enter your height (in meters): ");
  double height = Double.parseDouble(reader.readLine());

  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
  System.out.println("Height: " + height + " m");
} catch (IOException e) {
  e.printStackTrace();
}
```
