package library.system;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Library Management System Started ---");


        Library myLibrary = new Library("L001", "Main Library", "Main St");
        Book book1 = new Book("B001", "Java Programming", "John", "Tech Publish", "Programming", "Available");
        Member member1 = new Member("M001", "Asfa", "Asfa@email.com", "0123456789");


        myLibrary.addBook(book1);

        // Search for book
        System.out.println("\nSearching for book...");
        myLibrary.searchBook("Java Programming");


        if (book1.checkAvailability()) {
            System.out.println("Book is available!");


            BorrowBook loan = new BorrowBook("LOAN001", new Date(), new Date());
            loan.issueBook();

            book1.updateStatus("Borrowed");

            member1.borrowBook();
        } else {
            System.out.println("Book not available");
        }

        System.out.println("\n--- System Test Finished ---");
    }
}