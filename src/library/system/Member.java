package library.system;

public class Member {
    // Attributes
    private String memberID;
    private String name;
    private String email;
    private String phone;

    // Constructor
    public Member(String memberID, String name, String email, String phone) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Methods (These will be implemented later)
    public void borrowBook() {
        System.out.println(name + " is borrowing a book");
    }

    public void returnBook() {
        System.out.println(name + " is returning a book");
    }

    public void reserveBook() {
        System.out.println(name + " is reserving a book");
    }

    // Getters
    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
