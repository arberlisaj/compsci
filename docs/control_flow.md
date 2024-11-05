# Control Flow and Loops

**Comparison operators** allow you to perform comparisons between primitive types (like integers and floats) and also can be used with other types, such as characters. For object comparisons, use .equals() instead of ==.

```Java
int a = 5;
int b = 3;
int c = 8;

System.out.println("a == 5: " + (a == 5)); // true
System.out.println("a != b: " + (a != b)); // true
System.out.println("a > b: " + (a > b));   // true
System.out.println("b < c: " + (b < c));   // true
System.out.println("a >= 5: " + (a >= 5)); // true
System.out.println("c <= 8: " + (c <= 8)); // true
```

**Logical operators** are used to combine multiple boolean expressions or conditions. The main logical operators are:

```Java
boolean a = (5 > 3);  // true
boolean b = (8 > 5);  // true
boolean c = (2 > 4);  // false

// Logical AND
System.out.println("a && b: " + (a && b)); // true
System.out.println("a && c: " + (a && c)); // false

// Logical OR
System.out.println("a || b: " + (a || b)); // true
System.out.println("a || c: " + (a || c)); // true
System.out.println("c || c: " + (c || c)); // false

// Logical NOT
System.out.println("!a: " + !a); // false
System.out.println("!c: " + !c); // true
```

**if statements** are used to execute a block of code based on a condition. If the condition evaluates to true, the code inside the if block is executed.

```Java
int temp = 32;

if(temp > 30){
  System.out.println("It is a hot day.");
  System.out.println("Drink water!");
} else if (temp > 20 && temp <=30)
  System.out.println("Beautiful day");
else
  System.out.println("Cold day");

// Simplifying if statements
int income = 120_000;
boolean hasHighIncome = income > 100_000; // returns true

// Switch case statements
String role = "admin";
switch (role) {
  case "admin":
    System.out.println("You are the admin");
    break;
  case "moderator":
    System.out.println("You are a moderator");
    break;
  default:
    System.out.println("You are a guest");
}
```

The **Ternary operator** in Java offers a concise way to evaluate conditions and return values based on true or false, enhancing code clarity for simple checks.

```Java
String result = (1 > 0) ? "Positive" : "Negative or Zero";
```

**Loops** are used to execute a block of code repeatedly based on a specified condition. The main types of loops are the for loop, the while loop, and the do-while loop.

```Java
byte byteNumber = 0;
boolean isValid = false;

while (!isValid) {
  System.out.print("Enter number between -128 to 127: ");
  if (scanner.hasNextByte()) {
    byteNumber = scanner.nextByte();
    isValid = true;
  } else {
    System.out.println("Invalid input");
    scanner.next();
    }
  }

  if (byteNumber > 0) {
    for (byte i = 0; i < byteNumber; i++) {
     System.out.println(i);
    }
  }

  if (byteNumber < 0) {
    for (byte i = 0; i > byteNumber; i--) {
    System.out.println(i);
  }
}

// do-while Loop
do {
  System.out.println("Iteration: " + i);
  i++;
} while (i < 5);
```
