package library.system;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AI Generated Library System Running ---");

        Library lib = new Library("L1", "AI Library", "Cloud");
        Book b = new Book("B1", "Java AI", "Bot", "Tech", "CS");
        Member m = new Member("M1", "Alice", "Alice@test.com", "123");
        Librarian l = new Librarian("LB1", "Admin", "admin@test.com");

        l.addBook();
        lib.addBook(b);
        lib.searchBook("Java AI");

        if (b.checkAvailability()) {
            BorrowBook record = new BorrowBook("R1", new Date(), new Date());
            record.issueBook();
            b.updateStatus("Borrowed");
            m.borrowBook();
        }

        System.out.println("--- Finished ---");
    }
}