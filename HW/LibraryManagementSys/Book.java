class Book implements Displayable {

    private String title;
    private String publisher;
    private String author;
    private int total_page;
    private int publication_date;
    private double rating;
    private long isbn;

    // default constructor
    public Book() {
        title = "Unknown";
        publisher = "Unknown";
        author = "Unknown";
        rating = 0.0;
        total_page = 0;
        publication_date = 0;
        isbn = 0;
    }

    // parameterized constructor
    public Book(
        String title,
        String publisher,
        String author,
        double rating,
        int total_page,
        int publication_date,
        long isbn
    ) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.rating = rating;
        this.total_page = total_page;
        this.publication_date = publication_date;
        this.isbn = isbn;
    }

    //  getters
    // title
    public String getTitle() {
        return title;
    }

    //publisher
    public String getPublisher() {
        return publisher;
    }

    //author
    public String getAuthor() {
        return author;
    }

    // ratitg
    public double getRating() {
        return rating;
    }

    // total_page;
    public int getTotalPage() {
        return total_page;
    }

    // publication_date;
    public int getPublicationDate() {
        return publication_date;
    }

    // isbn;
    public long getISBN() {
        return isbn;
    }

    //
    //
    //
    //
    //

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTotalPage(int total_page) {
        this.total_page = total_page;
    }

    public void setPublicationDate(int publication_date) {
        this.publication_date = publication_date;
    }

    public void setISBN(long isbn) {
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Publisher   : " + publisher);
        System.out.println("Rating      : " + rating);
        System.out.println("Pages       : " + total_page);
        System.out.println("Published   : " + publication_date);
        System.out.println("ISBN        : " + isbn);
    }

   
    //
}
