# BIT6083 – Object Oriented Programming Assignment

**Course:** Object Oriented Programming (BIT6083)
**Lecturer:** Mr. Ashish Gautam
**Repo:** java2ndsem
**Location:** `java2ndsem/assignment/`

This folder contains the practical components (Task 2) of the OOP assignment. Each question has its own subfolder with the source code.

```
java2ndsem/
└── assignment/
    ├── README.md
    ├── q1/   → Practical 1: Classes, Objects & Constructors
    ├── q2/   → Practical 2: Inheritance & Method Overriding
    ├── q3/   → Practical 3: Polymorphism & Interfaces
    ├── q4/   → Practical 4: Exception Handling
    └── q5/   → Practical 5: Multithreading Simulation
```

---

## q1 – Classes, Objects & Constructors

**Question:** Create a Java program that defines a `Student` class with private attributes `name`, `lcid`, `year`, and `gpa`. Implement parameterized and default constructors, getter/setter methods, and a `displayInfo()` method. Create an array of at least 5 `Student` objects and display all records.

**Explanation:** The `Student` class keeps all fields `private` and exposes them through getters/setters, which is what encapsulation means in practice. Two constructors are provided — a parameterized one for setting real values right away, and a default one that fills in placeholder values, showing constructor overloading. `displayInfo()` prints out a formatted line for each student, and the `main` method builds an array of 5 `Student` objects (4 parameterized, 1 default) and loops through it to display all of them.

**File:** `q1/StudentDemo.java`

---

## q2 – Inheritance & Method Overriding

**Question:** Design a class hierarchy for a College Management System. Create a base class `Person` with attributes `name` and `email`. Extend it into `Lecturer` and `Student` classes, each with relevant additional attributes. Override `displayInfo()` in each subclass. Demonstrate the use of `super` to call the parent constructor.

**Explanation:** `Person` holds the shared fields (`name`, `email`) as `protected`, since both subclasses need direct access to them. `Student` adds `lcid` and `course`; `Lecturer` adds `department` and `experienceYears`. Both subclasses call `super(name, email)` in their constructors to initialize the inherited fields, then override `displayInfo()` — but instead of rewriting everything, each override calls `super.displayInfo()` first to reuse the parent's output, then adds its own extra details. This demonstrates both inheritance and method overriding in one program.

**File:** `q2/CollegeManagementDemo.java`

---

## q3 – Polymorphism & Interfaces

**Question:** Implement a Java program demonstrating method overloading (a `Calculator` class with multiple `add()` methods), method overriding (an abstract `Shape` class with `area()` implemented in `Circle`, `Rectangle`, `Triangle`), and an interface `Printable` with `printDetails()` implemented by at least two classes.

**Explanation:** `Calculator` has three `add()` methods with different parameter types/counts, which is compile-time polymorphism — the compiler picks the right version based on the arguments passed. `Shape` is an abstract class implementing `Printable`, with an abstract `area()` method that `Circle`, `Rectangle`, and `Triangle` each implement differently — this is runtime polymorphism, since the correct `area()` is chosen based on the actual object type at runtime. All three shape classes also implement `printDetails()` from the `Printable` interface, satisfying the interface requirement.

**File:** `q3/PolymorphismDemo.java`

---

## q4 – Exception Handling

**Question:** Write a Java program that handles `ArrayIndexOutOfBoundsException` and `NumberFormatException` using try-catch-finally, and creates a custom exception class `InvalidMarksException` thrown when marks fall outside 0–100.

**Explanation:** Three separate try-catch-finally blocks are used, one for each exception type. The first deliberately accesses an out-of-bounds array index, the second tries to parse a non-numeric string into an integer, and the third calls a `validateMarks()` method that throws the custom `InvalidMarksException` when the value passed is outside the valid range. Each `finally` block runs regardless of whether an exception occurred, and the program prints a final message afterward to show execution continues normally once exceptions are handled.

**File:** `q4/ExceptionDemo.java`

---

## q5 – Multithreading Simulation

**Question:** Develop a Java multithreading program that creates at least three threads (one extending `Thread`, two implementing `Runnable`), simulates a shared bank account balance accessed by multiple threads, uses `synchronized` to prevent race conditions, and demonstrates the thread lifecycle.

**Explanation:** `BankAccount` holds a shared `balance` field, and its `withdraw()` method is marked `synchronized` so only one thread can execute it at a time — this prevents a race condition where two threads read the same balance value before either has finished updating it. `WithdrawThread` extends `Thread` directly, while `WithdrawRunnable` is used by two separate `Thread` objects to show the `Runnable` approach. The program prints each thread's state (`NEW`, `RUNNING`) and uses `join()` to wait for all threads to finish before printing `TERMINATED`, demonstrating the thread lifecycle.

**File:** `q5/MultithreadingDemo.java`

---

## How to Run

Each folder contains a single `.java` file. To compile and run any of them:

```bash
cd assignment/q1
javac StudentDemo.java
java StudentDemo
```
