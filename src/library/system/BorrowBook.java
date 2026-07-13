package library.system;
import java.util.Date;

public class BorrowBook {
    private String borrowID;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    public BorrowBook(String borrowID, Date issueDate, Date dueDate) {
        this.borrowID = borrowID;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }


    public void issueBook() { System.out.println("Book issued for borrow ID: " + borrowID); }
    public void returnBook() { System.out.println("Book returned for borrow ID: " + borrowID); }

    public double calculateFine() {
        return 0.0;
    }

    public String getBorrowID() { return borrowID; }
}
