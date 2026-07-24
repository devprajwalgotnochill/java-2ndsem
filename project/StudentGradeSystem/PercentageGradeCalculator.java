import java.util.List;

/**
 * SRP: only responsible for one grading rule set (percentage -> letter).
 */
public class PercentageGradeCalculator implements GradeCalculator {

    @Override
    public double calculateAverage(Student student) {
        List<Double> marks = student.getMarks();
        if (marks.isEmpty()) return 0.0;

        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.size();
    }

    @Override
    public String calculateLetterGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}
