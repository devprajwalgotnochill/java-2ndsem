# Java OOP Concepts

A collection of Java files demonstrating core object-oriented programming concepts including classes, reference variables, the `this` keyword, and inheritance via `super`.

---
# 1 . Constructors

# Constructor.java

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

# DefaultConstructor.java

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

# ParameterizedConstructor.java

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

# ConstroctorOverloading.java

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

# ConstructorChanging.java

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