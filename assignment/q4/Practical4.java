import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Practical4 {

    // Method to validate marks
    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid Marks Entered: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = { 10, 20, 30 };

            System.out.println("Accessing array element:");
            System.out.println(numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException Caught: " + e.getMessage()
            );
        } finally {
            System.out.println("Array exception block completed.\n");
        }

        // Handling NumberFormatException
        try {
            String text = "ABC";
            int num = Integer.parseInt(text);

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(
                "NumberFormatException Caught: " + e.getMessage()
            );
        } finally {
            System.out.println("Number conversion block completed.\n");
        }

        // Handling Custom Exception
        try {
            System.out.print("Enter student marks (0-100): ");
            int marks = sc.nextInt();

            validateMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println(
                "InvalidMarksException Caught: " + e.getMessage()
            );
        }

        System.out.println("\nProgram continues after handling exceptions.");

        sc.close();
    }
}
