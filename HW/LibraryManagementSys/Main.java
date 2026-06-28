/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // default constructor
        Book b = new Book();

        // paramater constructor
        // L at the end of ISBN numbers — that tells Java it's a long literal
        Book b1 = new Book(
            "Harry Potter",
            "Bloomsbury",
            "J.K. Rowling",
            4.8,
            309,
            1997,
            9780747532699L
        );
        Book b2 = new Book(
            "Clean Code",
            "Prentice Hall",
            "Robert C. Martin",
            4.5,
            431,
            2008,
            9780132350884L
        );
        Book b3 = new Book(
            "The Alchemist",
            "HarperCollins",
            "Paulo Coelho",
            4.6,
            208,
            1988,
            9780062315007L
        );

        b.display();
        b1.display();
        b2.display();
        b3.display();

        // we need to provide all the paramater
    }
}
