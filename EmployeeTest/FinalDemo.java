import sun.jvm.hotspot.oops.SpeculativeTrapData;

final class Utility {

    public static int square(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }
}

// parent class

class bank {

    // final method
    public final double calInt(double amount) {
        return amount * 0.08;
    }
}

// child class
class SBI extends Bank {
    /*
    compiler error:cannot override final method
    public double calInt(double amout){
        return amount * 0.01;
    }
    */
}

public class FinaDemo {

    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 7;
        double area = PI * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area of Crrcle = " + area);

        SBI sbi = new SBI();

        double amount = 10000;
        double interest = sbi.calInt(amount);

        System.out.println("\nAmount = " + amount);
        System.out.println("\nInterest = " + interest);

        int num = 5;

        System.out.println("\nSquare of " + num + " = " + Utility.square(num));
        System.out.println("\nSquare of " + num + " = " + Utility.cube(num));
    }
}
