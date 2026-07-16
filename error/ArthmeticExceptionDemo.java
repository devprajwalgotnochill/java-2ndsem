public class ArthmeticExceptionDemo {

    public static void main(String[] args) {
        try {
            int totalScore = 500;
            int totalPlayer = 0;
            System.out.println("Calculateing average score per player");

            int averageScore = totalScore / totalPlayer;

            System.out.println("average score: " + averageScore);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero " + e.getMessage());
        }
    }
}
