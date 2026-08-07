class LifecycleThread extends Thread {

    private final Object lock;

    LifecycleThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread is in New state");

            // TIMED_WAITING state
            Thread.sleep(1000);
            System.out.println("After sleep: TIMED_WAITING completed");

            // WAITING state
            synchronized (lock) {
                System.out.println("Thread is in WAITING state");
                lock.wait();
                System.out.println("After notify: WAITING completed");
            }

            System.out.println("Thread resumed from WAITING state");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycleDemo {

    public static void main(String[] args) {
        Object lock = new Object();

        // NEW state
        LifecycleThread t1 = new LifecycleThread(lock);
        System.out.println("1. NEW: " + t1.getState());

        // RUNNABLE state
        t1.start();
        System.out.println("2. RUNNABLE: " + t1.getState());

        try {
            // Give time to enter sleep state
            Thread.sleep(500);
            System.out.println("3. During sleep: " + t1.getState());

            // Give time to enter wait state
            Thread.sleep(1000);
            System.out.println("4. During wait: " + t1.getState());

            synchronized (lock) {
                lock.notify();
            }

            // Wait for the thread to finish
            t1.join();

            // TERMINATED state
            System.out.println("5. TERMINATED: " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
