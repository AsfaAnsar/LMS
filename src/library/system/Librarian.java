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

    public void issueBook() { System.out.println(name + " issued a book."); }
    public void addBook() { System.out.println(name + " added a book to the system."); }
    public void removeBook() { System.out.println(name + " removed a book from the system."); }

    public String getLibrarianID() { return librarianID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
