package HW3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Fiction("The Black Girl Left Standing", " Juliana Goodman ", "978-0061120084");
        library.addBook(book);

        assertEquals(1, library.getBooks().size()); // Confirm one book added
        assertEquals("To Kill a Mockingbird", library.getBooks().get(0).title); // Confirm correct book added
    }

    @Test
    public void testCheckOutAndReturnBook() {
        Book book = new Fiction("It Ends With Us", "Colleen Hoover", "978-1501110368");
        book.check_out();
        assertTrue(book.is_checked_out); // Verify checked out

        book.return_book();
        assertFalse(book.is_checked_out); // Verify returned
    }
}
