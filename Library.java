package HW3;

import java.util.ArrayList;

/**
 * Class representing a library system.
 * Manages a collection of books, members, and staff, and  methods
 * to add books and members, and list all books, members, and staff in the library.
 */
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Staff> staff;

    
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection.
     *
     * @param book the Book object to be added to the library
     */
    public void add_Book(Book book) {
        books.add(book);
    }

    /**
     * Registers a new member in the library.
     *
     * @param member the Member object to be added to the library's list of members
     */
    public void register_member(Member member) {
        members.add(member);
    }

    /**
     * Prints a list of all books in the library, including each book's title, author, and type.
     */
    public void list_books() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " - " + book.describe());
        }
    }

    /**
     * Prints a list of all members registered in the library, including each member's name and ID.
     */
    public void list_Members() {
        for (Member member : members) {
            System.out.println(member.name + " (ID: " + member.id + ")");
        }
    }

    /**
     * Prints a list of all staff members working in the library, including each staff's name and ID.
     */
    public void list_Staff() {
        for (Staff person : staff) {
            System.out.println(person.name + " (ID: " + person.id + ")");
        }
    }
}
