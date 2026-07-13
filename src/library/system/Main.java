package library.system;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Library Management System Started ---");

        // 1. Create a Library
        Library myLibrary = new Library("L001", "Colombo public Library", "123 Main St");
        System.out.println("Library Created: " + myLibrary.getName());

        // 2. Create a Book
        Book book1 = new Book("B001", "Java", "John", "Tech Publish", "Programming");
        System.out.println("Book Created: " + book1.getTitle());
        System.out.println("Is Available? " + book1.checkAvailability());

        // 3. Add Book to Library
        myLibrary.addBook(book1);

        // 4. Create a Member
        Member member1 = new Member("M001", "Asfa", "Asfa@gmail.com", "555-1234");
        System.out.println("Member Created: " + member1.getName());

        // 5. Test Member Actions
        member1.borrowBook();

        System.out.println("--- System Test Finished ---");
    }
}
