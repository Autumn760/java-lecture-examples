package class03;

public class Book {

    // FIELDS

    // TODO: Declare private fields title, author, numPages, and available
    // available should be initialized to true
    private String title;
    private String author;
    private Integer numPages;
    private boolean available = true;


    // CONSTRUCTORS

    // TODO: Define a constructor that takes title, author, and numPages

    public Book(String title, String author, Integer numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    // TODO: Define an alternate (overloaded) constructor that requires only title and author
    public Book(String title, String author) {

        this(title, author, 0);
    }

    // GETTERS & SETTERS

    // TODO: Use the IntelliJ generate feature to create getters & setters
    // Create both getters & setters for title, author, and numPages
    // Create only a getter for available (we will have instance methods to set this)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public boolean isAvailable() {
        return available;
    }
// INSTANCE METHODS

    // TODO: Define a method, getTitleAndAuthor(), to return a string like "Book Title by Author Name"
    // It should have default access
    String getTitleAndAuthor() {
        return title + " by " + author;
    }

    // TODO: Define a method, checkOut(), with public access
    // It should change the availability and also print a statement with the title and author name
    public void checkOut() {
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library.");

    }

    // TODO: Define a method, checkIn(), with public access
    // It should change the availability and also print a statement with the title and author name
    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked into the library.");

    }
}
