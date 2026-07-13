package library.system;

public class Member {
    private String memberID;
    private String name;
    private String email;
    private String phone;

    public Member(String memberID, String name, String email, String phone) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void borrowBook() { System.out.println(name + " is borrowing a book."); }
    public void returnBook() { System.out.println(name + " is returning a book."); }
    public void reserveBook() { System.out.println(name + " is reserving a book."); }

    public String getMemberID() { return memberID; }
    public String getName() { return name; }
}