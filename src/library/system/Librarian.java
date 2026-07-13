package library.system;

public class Librarian {
    private String librarianID;
    private String name;
    private String email;

    public Librarian(String librarianID, String name, String email) {
        this.librarianID = librarianID;
        this.name = name;
        this.email = email;
    }


    public void issueBook() { System.out.println(name + " is issuing a book."); }
    public void addBook() { System.out.println(name + " is adding a book."); }
    public void removeBook() { System.out.println(name + " is removing a book."); }

    public String getName() { return name; }
}
