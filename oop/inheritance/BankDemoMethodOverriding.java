class Bank {

    public double intrestRate() {
        return 0.0;
    }
}

class SBI extends Bank {

    @Override
    public double intrestRate() {
        return 7.5;
    }
}

class NabilBank extends Bank {

    @Override
    public double intrestRate() {
        return 8.0;
    }
}

// main class
public class BankDemoMethodOverriding {

    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new NabilBank();

        System.out.println("SBI Intrest Rate : " + b1.intrestRate() + "%");
        System.out.println(
            "Nabil Bank Intrest Rate : " + b2.intrestRate() + "%"
        );
    }
}
