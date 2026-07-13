package library.system;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Library Management System Started ---");


        Library myLibrary = new Library("L001", "Colombo public Library", "123 Main St");
        System.out.println("Library Created: " + myLibrary.getName());


        Book book1 = new Book("B001", "Java", "John", "Tech Publish", "Programming");
        System.out.println("Book Created: " + book1.getTitle());
        System.out.println("Is Available? " + book1.checkAvailability());


        myLibrary.addBook(book1);


        Member member1 = new Member("M001", "Asfa", "Asfa@gmail.com", "555-1234");
        System.out.println("Member Created: " + member1.getName());


        member1.borrowBook();

        System.out.println("--- System Test Finished ---");
    }
}
