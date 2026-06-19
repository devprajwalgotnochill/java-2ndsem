class Shape {

    void display() {
        System.out.println("This is shape.");
    }
}

// child 1
class Circle extends Shape {

    void area(double rad) {
        double area = Math.PI * rad * rad;
        System.out.println(area);
    }
}

// child 2

class Rectangle extends Shape {

    void area(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// mainclass

public class HierarchicalInheritance {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area(10);

        System.out.println();

        Rectangle r = new Rectangle();
        r.display();
        r.area(4, 6);
    }
}
