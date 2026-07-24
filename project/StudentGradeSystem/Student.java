import java.util.ArrayList;
import java.util.List;

/**
 * ENCAPSULATION
 * All fields are private. Nothing outside this class can read or
 * write them directly - access only happens through the public
 * methods below, and addMark() guards against invalid data.
 *
 * SRP
 * This class does one thing: hold a student's identity and marks.
 * It does not calculate averages and does not print anything.
 */
public class Student {
    private final String id;
    private final String name;
    private final List<Double> marks;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public void addMark(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        marks.add(mark);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Double> getMarks() {
        // return a copy so a caller can't mutate the internal list
        return new ArrayList<>(marks);
    }
}
