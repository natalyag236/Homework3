package HW3;
/**
 * Class representing a Fiction book.
 * Extends to the  abstract Book class and specifies the type as "Fiction".
 */
public class Fiction extends Book {
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }
    /** 
    * A class for a  Fiction book with the specified title, author, and ISBN.
    *
    * @param title  the title of the book
    * @param author the author of the book
    * @param ISBN   the ISBN of the book
    */

    
    public String describe() {
        return "Fiction";
    }

    /**
     * Returns a string indicating that this book is "Fiction".
     *
     * @return a string "Fiction" representing the genre of the book
     */
}


