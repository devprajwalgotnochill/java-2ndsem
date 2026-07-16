package abstraction;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers:" + calc.add(1, 2));
        System.out.println("Addition of two integers:" + calc.add(1, 2, 3));
        System.out.println("Addition of two integers:" + calc.add(1.1, 2.2));
        //
    }
}
