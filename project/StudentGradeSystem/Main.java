public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Prajwal");
        s1.addMark(85);
        s1.addMark(90);
        s1.addMark(78);

        Student s2 = new Student("S002", "Anjali");
        s2.addMark(60);
        s2.addMark(55);
        s2.addMark(70);

        // DIP: Main decides which concrete calculator to use,
        // ResultPrinter only ever sees the GradeCalculator interface.
        GradeCalculator percentageCalculator = new PercentageGradeCalculator();
        ResultPrinter printer = new ResultPrinter(percentageCalculator);

        printer.printResult(s1);
        printer.printResult(s2);

        // OCP: swap in a different grading scheme, zero changes needed
        // in Student, GradeCalculator, or ResultPrinter.
        GradeCalculator gpaCalculator = new GpaGradeCalculator();
        ResultPrinter gpaPrinter = new ResultPrinter(gpaCalculator);
        gpaPrinter.printResult(s1);
    }
}
