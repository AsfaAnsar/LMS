package library.system;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryID;
    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;

    public Library(String libraryID, String name, String address) {
        this.libraryID = libraryID;
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added to library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed from library: " + book.getTitle());
    }

    public void searchBook(String title) {
        System.out.println("Searching for: " + title);
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + b.getTitle() + " (" + b.getStatus() + ")");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public String getLibraryID() { return libraryID; }
    public String getName() { return name; }
    public String getAddress() { return address; }
}
