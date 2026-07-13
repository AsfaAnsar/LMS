package library.system;

public class Book {
    // Attributes (Private - as per UML)
    private String bookID;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private String status; // "Available" or "Borrowed"

    // Constructor
    public Book(String bookID, String title, String author, String publisher, String category) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.status = "Available"; // New books are always available
    }

    // Methods (Public - as per UML)
    public boolean checkAvailability() {
        return this.status.equals("Available");
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters and Setters
    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}