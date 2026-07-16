abstract class Shape {

    abstract double calculateArea(); // every shape MUST implement this
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class test {

    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        printArea(new Circle(5));
        printArea(new Rectangle(4, 6));
    }
}
