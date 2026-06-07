# Java OOP Concepts

A collection of Java files demonstrating core object-oriented programming concepts including classes, reference variables, the `this` keyword, and inheritance via `super`.
# 4 brothers of oop 
---
# Constructors

# 1.Constructor.java

Introduces the concept of a Java constructor. A constructor shares the class name, has no return type, and is called automatically when an object is created. Used here to initialize `name` and `id` via `this`.

```java
package constructor;

class Example {
    String name;
    int id;

    Example(String name, int id) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Name " + name + " ID: " + id);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Example ex = new Example("Prajwal", 12);
        ex.display();
    }
}
```

---

# 2.DefaultConstructor.java

Shows a no-argument (default) constructor. If no constructor is defined Java provides one automatically; here one is defined explicitly to print a message when an object is instantiated.

```java
class Geeks {

    Geeks() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        Geeks hello = new Geeks();
    }
}
```

---

# 3.ParameterizedConstructor.java

Demonstrates a parameterized constructor that accepts arguments at the time of object creation to set field values directly, without needing separate setter methods.

```java
package constructor;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        StudentID s1 = new StudentID("Prajwal", 12);
    }
}

class StudentID {
    StudentID(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
```

---

# 4.ConstroctorOverloading.java

Demonstrates constructor overloading where a class defines multiple constructors with different parameter lists. Java selects the correct one based on the arguments passed at object creation.

```java
package constructor;

class Student {
    String name;
    int id;

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    Student(int id) {
        System.out.println("Id: " + id);
    }
}

public class ConstroctorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student("Prajwal");
        Student s2 = new Student("Prajwal", 123);
        Student s3 = new Student(123);
    }
}
```

---

# 5.ConstructorChanging.java

Shows chained constructor calls using `this()`. The default constructor calls the `int` constructor, which in turn calls the `String, int` constructor, demonstrating a chain of delegation before each constructor finishes its own output.

```java
package constructor;

public class ConstructorChanging {
    public static void main(String[] args) {
        new Student();
    }
}

class Student {
    String name;
    int id;

    Student() {
        this(123);
        System.out.println("Default");
    }

    Student(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    Student(int id) {
        this("Prajwal", 123);
        System.out.println("Id");
    }
}
```

---




# Abstraction 
Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.

It hides the complex details and shows only essential features.
Abstract classes may have methods without implementation and must be implemented by subclasses.

```java
package abstraction;
// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void makeSound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Concrete class
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Animal a = new Dog(); // Upcasting

        a.makeSound(); // Calls Dog's implementation
        a.sleep();     // Calls Animal's method
    }
}
```

# Encapsulation
Encapsulation in Java is an object-oriented principle that binds data and methods into a single unit, typically a class. It restricts direct access to data by hiding implementation details. This ensures controlled interaction with the data through defined methods.
Achieved using access modifiers like private, protected, and public.
```java
package Encapsulation;
class BankAccount {
    private String accountHolder;
    private double amount;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAmount() {
        return amount;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setAccountHolder("Santosh");
        ba.setAmount(123);

        System.out.println("Account Holder Name: " +ba.getAccountHolder());

        System.out.println("Balance: " + ba.getAmount());
    }
}
```

# Inheritance
Inheritance in Java is a core OOP concept that allows a class to acquire properties and behaviors from another class.

# 1.Single Inheritance
```java
//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass 
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
    }
}
```

# 2.Multilevel Inheritance
```java
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Car obj = new Car(); // Triggers all constructors in order
    }
}
```



# 3.Multiple Inheritance
In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.
Note: that Java does not support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through Interfaces. 
```java
interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}
interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}
// Subclass implementing both interfaces
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}
public class Test {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();
    }
}
```

# 4.Hierarchical Inheritance
hierarchical inheritance, more than one subclass is inherited from a single base class.
```java
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj1 = new Car(); 
        Bus obj2 = new Bus(); 
    }
}
```

# Strings
In Java, a ⁠String is an object that represents a sequence of characters. Unlike standard primitive data types like int or char, strings are defined by the predefined, final java.lang.String class.

# StringBufferAppendDemo.java
StringBuffer is thread-safe

```java
StringBuffer sb = new StringBuffer();
sb.append("Java");
sb.append("Programming");
System.out.println("Result: " + sb.toString());
```

---

# StringBuildingAppendDemo.java
StringBuilder faster, non-thread-safe 

```java
StringBuilder sb = new StringBuilder();
sb.append("Java");
sb.append("Programming");
System.out.println("Result: " + sb.toString());
```

---

# StringImmutabilityDemo.java
Demonstrates that `String` objects are immutable in Java — `concat()` does not modify the original string unless the result is reassigned.

```java
String str = "Prajwal";
str.concat("Gharti");           // no effect, result discarded
str = str.concat("Gharti");     // works: new object assigned back to str
System.out.println(str);
```

---

# VowelConsonantCount.java
Counts the number of vowels and consonants in a hardcoded string by iterating over each character.

```java
String str = "Prajwal Gharti";
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
    else consonants++;
}
```

---

# VowelConsonantCountWithScanner.java
Same vowel/consonant counting logic as above, but accepts user input at runtime via `Scanner`.

```java
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
// ... same counting logic ...
sc.close();
```

# Student.java

Defines a basic `Student` class with `id` and `name` fields. Demonstrates how Java initializes instance variables to default values (`0` and `null`) when no constructor is called explicitly.

```java
public class Student {
    int id;
    String name;

    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.id + " " + s1.name);
    }
}
```

---

# RefVariables.java

Shows how to create an object and set its fields directly using dot notation through a reference variable.

```java
class Student {
    int id;
    String name;
}

public class RefVariables {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 2323;
        s1.name = "Prajwal";
        System.out.println(s1.id + " " + s1.name);
    }
}
```

---

# MethodVariable.java

Demonstrates the use of the `this` keyword inside a method to distinguish between instance variables and method parameters that share the same name.

```java
class Student {
    int id;
    String name;

    void insertData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void Display() {
        System.out.println(id + " " + name);
    }
}

public class MethodVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertData(12, "Prajwal");
        s1.Display();
    }
}
```

---

# DemoThis.java

Shows constructor chaining within the same class using `this()`. Calling `this(10)` from the no-arg constructor delegates to the parameterized constructor before continuing execution.

```java
class DemoThis {
    DemoThis() {
        this(10);
        System.out.println("No-arg constructor");
    }

    DemoThis(int a) {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        new DemoThis();
    }
}
```

---

# Super.java

Demonstrates inheritance and constructor chaining between a parent class `Base` and child class `Super` using the `super()` keyword. Shows how parent constructors are invoked before child constructors run.

```java
class Base {
    String name;
    int id;

    Base() {
        System.out.println("Base class default constructor called");
    }

    Base(String name, int id) {
        this();
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class Super extends Base {
    Super() {
        super();
        System.out.println("Derived class default constructor called");
    }

    Super(String name, int id) {
        super(name, id);
        System.out.println("Derived class constructor called");
    }

    public static void main(String[] args) {
        Super obj1 = new Super();
        Super obj2 = new Super("Prajwal", 123);
    }
}
```

---

# TestStudent.java

A minimal test class that creates a `Student` object and prints its default field values, verifying Java's default initialization behavior for `int` and `String`.

```java
class Student {
    int id;
    String name;
}

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id + " " + s1.name);
    }
}
```