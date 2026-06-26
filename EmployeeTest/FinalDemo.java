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
	
    }
}
