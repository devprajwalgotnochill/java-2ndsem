/**
 * SRP: this class has exactly one job - format and print a result.
 * It does not know how averages are computed and does not touch
 * Student's internals directly.
 *
 * DIP
 * ResultPrinter depends on the GradeCalculator interface (an
 * abstraction), not on PercentageGradeCalculator or GpaGradeCalculator
 * directly. The concrete calculator is handed in through the
 * constructor, so this class never needs to change when a new
 * grading scheme is added.
 */
public class ResultPrinter {
    private final GradeCalculator gradeCalculator;

    public ResultPrinter(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    public void printResult(Student student) {
        double average = gradeCalculator.calculateAverage(student);
        String grade = gradeCalculator.calculateLetterGrade(average);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Name:       " + student.getName());
        System.out.printf("Average:    %.2f%n", average);
        System.out.println("Grade:      " + grade);
        System.out.println("------------------------");
    }
}
