package Encapsulation;
class BankAccount {
    private String accountHolder;
    private double amount;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAmount() {
        return amount;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setAccountHolder("Santosh");
        ba.setAmount(123);

        System.out.println("Account Holder Name: " +ba.getAccountHolder());

        System.out.println("Balance: " + ba.getAmount());
    }
}