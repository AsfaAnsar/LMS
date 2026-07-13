package library.system;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private String status;

    public Book(String bookID, String title, String author, String publisher, String category, String status) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.status = status;
    }

    // Method from Class Diagram
    public boolean checkAvailability() {
        return this.status.equalsIgnoreCase("Available");
    }

    // Helper method needed for Activity Diagram ("Update book status")
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters
    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
}