import java.util.List;

/**
 * OCP IN ACTION
 * This is a brand new grading scheme (4.0 GPA scale). It was added
 * by writing a new file, not by editing Student, GradeCalculator,
 * PercentageGradeCalculator, or ResultPrinter. The system is "open
 * for extension, closed for modification."
 */
public class GpaGradeCalculator implements GradeCalculator {

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
        if (average >= 90) return "4.0";
        if (average >= 80) return "3.0";
        if (average >= 70) return "2.0";
        if (average >= 60) return "1.0";
        return "0.0";
    }
}
