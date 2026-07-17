abstract class Shape {

    abstract double area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double l, w;

    Rectangle(double l, double w) {
        this.w = w;
        this.l = l;
    }

    double area() {
        return l * w;
    }
}

/**
 * OCPExample
 */
public class OCPExample {

    public static void main(String[] args) {
        Shape s1 = new Circle(12);
        Shape s2 = new Rectangle(12, 12);

        System.out.println("circle area : " + s1.area());
        System.out.println("rectangle area : " + s2.area());
    }
}
