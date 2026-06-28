// Book is a parent. ReferenceBook is a child.
class ReferenceBook extends Book {

    private String department;

    public ReferenceBook(
        String title,
        String publisher,
        String author,
        double rating,
        int total_page,
        int publication_date,
        long isbn,
        String department
    ) {
        // calling the parent's constructor
        super(
            title,
            publisher,
            author,
            rating,
            total_page,
            publication_date,
            isbn
        );
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // overrides the display method
    // Method override
    @Override
    public void display() {
        super.display();
        System.out.println("Department  : " + department);
    }
}

/*
Book.display() prints:
    Title, Author, Publisher, Rating, Pages, Published, ISBN

ReferenceBook.display() prints:
    Title, Author, Publisher, Rating, Pages, Published, ISBN  ← from super.display()
    Department  ← added by ReferenceBook
*/
