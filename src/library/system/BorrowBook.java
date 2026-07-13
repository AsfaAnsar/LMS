package library.system;
import java.util.Date;

public class BorrowBook {
    private String borrowID;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;
    private double fineAmount;

    public BorrowBook(String borrowID, Date issueDate, Date dueDate) {
        this.borrowID = borrowID;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.fineAmount = 0.0;
    }

    public void issueBook() { System.out.println("Loan " + borrowID + " issued."); }
    public void returnBook() { System.out.println("Loan " + borrowID + " returned."); }

    public double calculateFine() {
        return fineAmount;
    }

    public String getBorrowID() { return borrowID; }
    public Date getIssueDate() { return issueDate; }
    public Date getDueDate() { return dueDate; }
}
