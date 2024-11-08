package HW3;
/**
 * Class representing a Non-Fiction book.
 * Extends the abstract Book class and specifies the type as "Non-Fiction".
 */
public class NonFiction extends Book {
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);

    /**
     * Constructs a new Non-Fiction book with the specified title, author, and ISBN.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param ISBN   the International Standard Book Number (ISBN) of the book
     */
    }

    public String describe() {
        return "Non-Fiction";
    }
}
 
