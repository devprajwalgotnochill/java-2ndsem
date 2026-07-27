// Shared Resource
class BankAccount {

    private int balance = 1000;

    // Synchronized method
    public synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is trying to withdraw $" + amount);

        if (balance >= amount) {
            System.out.println(name + " is processing...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println(name + " completed withdrawal.");
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println(
                name + " cannot withdraw. Insufficient Balance."
            );
        }

        System.out.println();
    }
}

// Thread by Extending Thread
class Customer1 extends Thread {

    BankAccount account;

    public Customer1(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(getName() + " State: RUNNING");
        account.withdraw(getName(), 500);
    }
}

// Thread by Implementing Runnable
class Customer2 implements Runnable {

    BankAccount account;

    public Customer2(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(
            Thread.currentThread().getName() + " State: RUNNING"
        );
        account.withdraw(Thread.currentThread().getName(), 400);
    }
}

// Thread by Implementing Runnable
class Customer3 implements Runnable {

    BankAccount account;

    public Customer3(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(
            Thread.currentThread().getName() + " State: RUNNING"
        );
        account.withdraw(Thread.currentThread().getName(), 300);
    }
}

public class Practical5 {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Customer1 t1 = new Customer1(account);
        Thread t2 = new Thread(new Customer2(account), "Customer-2");
        Thread t3 = new Thread(new Customer3(account), "Customer-3");

        // NEW State
        System.out.println("Thread States Before Start:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());

        System.out.println();

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(200);

        // RUNNABLE/BLOCKED State
        System.out.println("\nThread States During Execution:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());

        t1.join();
        t2.join();
        t3.join();

        // TERMINATED State
        System.out.println("\nThread States After Completion:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());
    }
}
