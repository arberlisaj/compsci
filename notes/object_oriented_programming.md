# Object Oriented Programming

A **class** is a blueprint for creating objects, representing a concept or entity with attributes (fields) and behaviors (methods). Think of a class as a template. Each instance (object) created from the class has its own copy of these fields and can execute the methods defined within the class.

```Java
public class BankAccount {
  // Fields (private for encapsulation)
  private String accountNumber;
  private String accountHolderName;
  private double balance;
  // Static field shared by all accounts
  private static double interestRate = 0.02;

  // Constructor to initialize fields
  public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
  }

  // Getter and Setter for account holder name
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  // Deposit method
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  // Withdraw method
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: $" + amount);
    } else {
      System.out.println("Insufficient funds or invalid amount.");
    }
  }

  // Method to calculate interest based on current balance
  public double calculateInterest() {
    return balance * interestRate;
  }

  // Method to display account details
  public void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Balance: $" + balance);
  }

  // Static method to change the interest rate
  public static void setInterestRate(double newRate) {
    interestRate = newRate;
  }
}
```

**Memory allocation** - Stack is used for storing primitive types (numbers, boolean and character) and variables that store references to objects in the heap. Variables stored in the stack are immediately cleared when they go out of scope (eg when a method finishes execution). Objects stored in the heap get removed later on when they’re no longer references. This is done by Java’s garbage collector.

```Java
// Both are referencing the same Input object on the Heap so there is only one single object and not two
var input1 = new Input();
var input2 = input1;

// The object changes so both variables get affected
input2.setPlaceholder("Hello World");
```

**Coupling** is about how much a class depends or is connected with another. We want to reduce this coupling between classes, we are not aiming to eleminate coupling but reduce it.

```Java
// Coupling - in this class we have 4 coupling points
var employee = new Employee();
employee.setBaseSalary(50_000);
employee.setHourlyRate(20);
int wage = employee.calculateWage(10)
```

**Constructors** - a special method used to initialize objects. Constructors are called when an object is created using the new keyword. They have the same name as the class and no return type (not even void).

```Java
// Complex constructor that handles multiple fields
public class LibraryBook {
  private String title;
  private String author;
  private String ISBN;
  private int publicationYear;
  private boolean isAvailable;

public LibraryBook(String title, String author, String ISBN, int publicationYear) {
  this.title = title;
  this.author = author;
  this.ISBN = ISBN;

  // Validate the publication year
  if (publicationYear > 0) {
    this.publicationYear = publicationYear;
  } else {
    System.out.println("Invalid publication year. Setting year to unknown (0).");
    this.publicationYear = 0;  // Unknown year
  }

  // Set availability based on publication year
     this.isAvailable = publicationYear <= 2022;
  }

 // Method to borrow the book
 public void borrowBook() {
   if (isAvailable) {
     isAvailable = false;
     System.out.println("You've successfully borrowed \"" + title + "\".");
  } else {
    System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
  }
 }

    // Method to return the book
  public void returnBook() {
      isAvailable = true;
      System.out.println("Thank you for returning \"" + title + "\".");
  }

  // Display book details
  public void displayBookInfo() {
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("ISBN: " + ISBN);
      System.out.println("Publication Year: " + publicationYear);
      System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
  }
}
```

**Method overloading** is a feature in Java that allows a class to have multiple methods with the same name but different parameter lists. This means you can define multiple versions of a method with the same name, as long as each version has a unique combination of parameters (differing in number, type, or order). Method overloading improves code readability and allows methods to handle different types of input in a concise way.

```Java
class MathUtils {
  // Method with one parameter
  int add(int a) {
      return a + 10;
  }

  // Overloaded method with two parameters
  int add(int a, int b) {
      return a + b;
  }

  // Overloaded method with different parameter types
  double add(double a, double b) {
      return a + b;
  }
}
```

**Constructor overloading** in Java means defining multiple constructors with different parameters within the same class. It allows you to create objects in multiple ways, depending on the information available. Each constructor differs by the number, type, or order of parameters, enabling flexibility when initializing objects.

```Java
class Car {
    String model;
    int year;
    String color;

    // Constructor 1: No parameters
    Car() {
        model = "Unknown";
        year = 0;
        color = "Not specified";
    }

    // Constructor 2: One parameter
    Car(String model) {
        this.model = model;
        year = 0;
        color = "Not specified";
    }

    // Constructor 3: Two parameters
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        color = "Not specified";
    }

    // Constructor 4: Three parameters
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
```

**Static members** are fields (variables) or methods that belong to the class itself rather than to instances of the class. They are shared across all instances, meaning that if a variable or method is static, it can be accessed without creating an object of the class. Static members are often used when we need a common property or behavior for all objects of a class.

```Java
class Counter {
  static int count = 0;

  Counter() {
    // Increase the count whenever an object is created
    count++;
  }
}

public class Main {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();

    System.out.println(Counter.count); // Output: 3
  }
}
```

- Four pillars of Object Oriented Programming

**Encapsulation** is a principle of object-oriented programming that involves bundling the data (fields) and methods that operate on that data within a single unit or class. It also involves restricting access to certain components of an object to protect its integrity and prevent outside interference.

```Java
// Bundle the data and methods that operate on the data in a single unit.
public static void main(String[] args){
var employee = new Employee();
employee.setBaseSalary(50_000);
employee.hourlyRate = 20;
int wage = employee.calculateWage(10);

System.out.println(wage);
```

```Java
// We have encapsulated the data in a single class.
public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public int calculateWage(int extraHours) {
    return baseSalary + (hourlyRate * extraHours);
  };

  public void setBaseSalary(int baseSalary){
    if(baseSalary <=0){
      throw new IllegalArgumentException("Salary cannot be 0 or less");
    }
    this.baseSalary = baseSalary;
  }

  public int getBaseSalary(){
    return baseSalary;
  }

  public setHourlyRate(int hourlyRate){
    if(hourlyRate <=0){
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
    }
    this.hourlyRate = hourlyRate;
  }

  public getHourlyRage(){
    return hourlyRage;
  }
}
```

**Abstraction** is a concept in object-oriented programming that hides the complex implementation details of a class and only exposes the essential features. It allows a programmer to work with high-level functionality without needing to know the underlying implementation. Abstraction can be achieved in Java through abstract classes and interfaces.

**Inheritance** is a fundamental concept in object-oriented programming (OOP) that allows a class (called a subclass or derived class) to inherit properties and behaviors (fields and methods) from another class (called a superclass or base class). This relationship enables code reuse and helps create a natural hierarchy in code structures.

```Java
// Superclass (Base class)
class Animal {
  String name;

  // Constructor
  public Animal(String name) {
      this.name = name;
  }

  // Method
  public void eat() {
      System.out.println(name + " is eating.");
  }
}

// Subclass Dog inherits from Animal
class Dog extends Animal {
  public Dog(String name) {
      super(name); // Calls the constructor of the superclass
  }

  // Overriding the eat method
  @Override
  public void eat() {
      System.out.println(name + " is eating dog food.");
  }

  // New method specific to Dog
  public void bark() {
      System.out.println(name + " is barking.");
  }
}

// Subclass Cat inherits from Animal
class Cat extends Animal {
  public Cat(String name) {
      super(name); // Calls the constructor of the superclass
   }

  // Overriding the eat method
  @Override
  public void eat() {
      System.out.println(name + " is eating cat food.");
  }

  // New method specific to Cat
  public void meow() {
      System.out.println(name + " is meowing.");
  }
}

public class Main {
  public static void main(String[] args) {
      Dog dog = new Dog("Buddy");
      Cat cat = new Cat("Whiskers");

      dog.eat();     // Output: Buddy is eating dog food.
      dog.bark();    // Output: Buddy is barking.

      cat.eat();     // Output: Whiskers is eating cat food.
      cat.meow();    // Output: Whiskers is meowing.
  }
}
```

**Polymorphism** allows objects of different classes to respond uniquely to the same method, enhancing flexibility by enabling a unified interface for varied behaviors.

```Java
class Printer {
  // Method with one parameter
  public void print(String message) {
      System.out.println("Message: " + message);
  }

  // Overloaded method with two parameters
  public void print(String message, int times) {
      for (int i = 0; i < times; i++) {
          System.out.println("Message: " + message);
      }
  }
}

public class Main {
  public static void main(String[] args) {
      Printer printer = new Printer();
      printer.print("Hello");         // Output: Hello (prints once)
      printer.print("Hello", 3);      // Output: Hello (prints three times)
  }
}
```
