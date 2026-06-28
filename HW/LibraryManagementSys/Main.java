class Main {

    public static void main(String[] args) {
        // create the library with a size of 5
        // array of object
        Library library = new Library(5);

        // default params
        Book b = new Book();
        // create Book objects using parameterized constructor
        //

        //paramaters constructor
        Book b1 = new Book(
            "Harry Potter",
            "Bloomsbury",
            "J.K. Rowling",
            4.8,
            309,
            1997,
            9780747532699L
        );

        //
        // create ReferenceBook objects
        ReferenceBook r1 = new ReferenceBook(
            "Intro to Algorithms",
            "MIT Press",
            "Thomas Cormen",
            4.7,
            1292,
            2009,
            9780262033848L,
            "Computer Science"
        );

        // add all books to the library
        library.addBook(b);
        library.addBook(b1);
        library.addBook(r1);

        // display all books
        library.displayAll();

        // directly borrows books from the Book class
        // b1.borrow(); // Harry Potter has been borrowed.
        // b1.borrow(); // Harry Potter is already borrowed.
        // b1.returnBook();
        //

        // ask library -> class Book
        library.borrowBook(1); // borrows Harry Potter
        library.borrowBook(1); // already borrowed
        library.returnBook(1);

        library.borrowBook(2);

        // library.borrowBook(12);
    }
}
