package HW3;
/**
 * Class representing a staff member in a library system.
 * Extends the abstract Person class and provides functionality
 * for registering members and books in the library.
 */
public class Staff extends Person {
    public Staff(String name, String id) {
            super(name, id);
        }
       /**
        * Constructs a new Staff member with the specified name and ID.
        *
        * @param name the name of the staff member
        * @param id   the unique identifier (staff ID) for the staff member
        */
    public void register_member(Library library, Member member) {
            library.register_member(member);
            /** 
            * Registers a new member in the library.
            *
            * @param library the Library instance in which to register the member
            * @param member  the Member object to be registered
            */
        }
    
    public void register_book(Library library, Book book) {
            library.add_Book(book);
    /**
     * Registers a new book in the library.
     *
     * @param library the Library instance in which to register the book
     * @param book    the Book object to be added to the library's collection
     */
        }

     /**
     * Provides a description of the person as "Staff".
     *
     * @return a string "Staff" representing the role of the person
     */
        
    public String describe() {
            return "Staff";
        }
    }

