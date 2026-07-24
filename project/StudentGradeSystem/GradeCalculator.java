/**
 * ABSTRACTION
 * This interface hides how an average or a letter grade is actually
 * computed. Callers only need to know "give me an average" and
 * "give me a letter grade" - not the formula behind it.
 *
 * This interface is also what makes OCP and DIP possible below.
 */
public interface GradeCalculator {
    double calculateAverage(Student student);
    String calculateLetterGrade(double average);
}
