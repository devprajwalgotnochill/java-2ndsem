// Abstraction

import java.util.Scanner;

abstract class LibraryService {

    abstract void issueBook(String bookTitle);

    abstract void returnBook(String bookTitle);
}

// Inheritance + Encapulation
class User {

    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }
}

// Student (polymorhism - overriding)
class StudentMember extends User {

    public StudentMember(String name, int userId) {
        super(name, userId);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }
}

// Faculty (polimorhism - overriding)
class FacultyMember extends User {

    public FacultyMember(String name, int userId) {
        super(name, userId);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }
}

// main Library

class Library extends LibraryService {

    private String[] books = {
        "Java Basic",
        "Data Structures",
        "OOP Concepts",
    };

    //method overloading
    public void searchBook(String title) {
        System.out.println("Searching by title: " + title);
    }

    public void searchBook(String title, String author) {
        System.out.println(
            "Searching by title and author: " + title + " , " + author
        );
    }

    public void searchBook(int isbn) {
        System.out.println("Searching by isbn: " + isbn);
    }

    // Abstraction implementation
    @Override
    void issueBook(String bookTitle) {
        System.out.println("Book issued: " + bookTitle);
    }

    @Override
    void returnBook(String bookTitle) {
        System.out.println("Book issued: " + bookTitle);
    }

    public void showBook() {
        System.out.println("\n Available Book: ");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}

/**
 * SmartLibrarySystem
 */
public class SmartLibrarySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // show book
        library.showBook();

        // User input
        System.out.println("\n Enter book name to issue");
        String issueBook = sc.nextLine();
        library.issueBook(issueBook);

        // User input for returning boo
        System.out.println("\nEnter book name to return:");
        String returBook = sc.nextLine();
        library.returnBook(returBook);

        // search exaple
        System.out.println("Title");
        String title = sc.nextLine();
        library.searchBook(title);

        System.out.println("Author and title");
        String author = sc.nextLine();
        library.searchBook(title, author);

        System.out.println("Isbn");
        int isbn = sc.nextInt();
        library.searchBook(isbn);
        sc.nextLine(); //clear buffer

        // User creation
        System.out.println("\n Enter Student name");
        String sName = sc.nextLine();
        System.out.println("Enter Student ID:");
        int sId = sc.nextInt();

        StudentMember st = new StudentMember(sName, sId);
        System.out.println("Enter days late for studen: ");
        int sDays = sc.nextInt();
        System.out.println("student fine :" + st.calculateFine(sDays));
        sc.nextLine();
        System.out.println("\nEnter a faculty name");
        String fName = sc.nextLine();
        System.out.println("Enter faculty ID: ");
        int fId = sc.nextInt();

        FacultyMember fa = new FacultyMember(fName, fId);
        System.out.println("Enter days late for faculty");
        int fDays = sc.nextInt();
        System.out.println("Faculty Fine" + fa.calculateFine(fDays));

        sc.close();
    }
}
