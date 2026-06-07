# Java OOP Concepts

A collection of Java files demonstrating core object-oriented programming concepts including classes, reference variables, the `this` keyword, and inheritance via `super`.

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