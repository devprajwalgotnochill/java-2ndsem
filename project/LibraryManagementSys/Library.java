class Library {

    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // adds books in library
    // if library full rejects
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("--- Book " + (i + 1) + " ---");
            books[i].display();
        }
    }

    public void borrowBook(int index) {
        if (index < 0 || index >= count) {
            System.out.println("No book found at that position.");
            return;
        }
        // class Book method
        books[index].borrow();
    }

    public void returnBook(int index) {
        // error check
        if (index < 0 || index >= count) {
            System.out.println("No book found at that position.");
            return;
        }
        // class Book method
        books[index].returnBook();
    }
}
