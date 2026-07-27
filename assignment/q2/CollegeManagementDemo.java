/*
Practical 2: Inheritance & Method Overriding  (10 Marks) Design a class hierarchy for a College Management System:
•	Create a base class Person with attributes name and email.
•	Extend it into Lecturer and Student classes, each with relevant additional attributes.
•	Override the displayInfo() method in each subclass.
•	Demonstrate the use of the super keyword to call the parent constructor.
Include source code and output screenshots.
 */

// Method Overloading

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Interface
interface Printable {
    void printDetails();
}

// Abstract class for method overriding
abstract class Shape implements Printable {

    abstract double area();
}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + area());
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public void printDetails() {
        System.out.println(
            "Rectangle - Length: " +
                length +
                ", Width: " +
                width +
                ", Area: " +
                area()
        );
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    public void printDetails() {
        System.out.println(
            "Triangle - Base: " +
                base +
                ", Height: " +
                height +
                ", Area: " +
                area()
        );
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        // Overloading demo
        Calculator calc = new Calculator();
        System.out.println("int add: " + calc.add(2, 3));
        System.out.println("double add: " + calc.add(2.5, 3.5));
        System.out.println("3-arg add: " + calc.add(1, 2, 3));

        System.out.println();

        // Overriding + interface demo
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        for (Shape s : shapes) {
            s.printDetails();
        }
    }
}
