public class InterfacePaymentDemo {

    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment upi = new UPI();

        creditCard.makePayment(100.12);
        upi.makePayment(102.12);
    }
}

interface Payment {
    void makePayment(double amount);
}

class CreditCard implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println(
            "Payment of $ " + amount + " made using credit card"
        );
    }
}

class UPI implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $ " + amount + " made using UPI");
    }
}
