class Shape {

    public void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// child Class -Rectangle

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle ");
    }
}

// main class
public class ShapeDemo {

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Circle();
        Shape s3 = new Rectangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
