public class ErrorExample {

    // A method that calls itself infinitely
    public static void crashMe() {
        // Line below cause recursivecall with no exit condition
        crashMe();
    }

    public static void main(String[] args) {
        System.out.println("Starting the program...");
        try {
            // Invoking the infinite
            crashMe();
        } catch (Exception e) {
            // This block will Not execute!
            System.out.println("This will not catch the error.");
        }
    }
}
