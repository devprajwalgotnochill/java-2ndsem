abstract class Shape {

    abstract double calculateArea();
}

// circle class
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Recangle
//
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);

        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println("Rectangle Area = " + rectangle.calculateArea());
    }
}
