package HW3;

public abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean is_checked_out;

    /**
     * Abstract class for  new Book with the specified title, author, and ISBN.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param ISBN   the ISBN of the book
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.is_checked_out = false; // Initially, the book is not checked out
    }

    /**
     * Marks the book as checked out by setting the isCheckedOut flag to true.
     */
    public void check_out() {
        this.is_checked_out = true;
    }

    /**
     * Marks the book as returned by setting the isCheckedOut flag to false.
     */
    public void return_book() {
        this.is_checked_out = false;
    }

    /**
     * Abstract method to describe the type or genre of the book.
     * 
     *
     * @return a string description indicating the type of book
     */
    public abstract String describe();
}

