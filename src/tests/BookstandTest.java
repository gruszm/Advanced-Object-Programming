package tests;

import decoration.BookInterface;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.Bookstand;
import table.BookstandException;
import table.Shelf;

import static org.junit.jupiter.api.Assertions.*;

class BookstandTest
{
    private Bookstand bookstand;
    private Shelf shelf;

    @BeforeEach
    void setUp() {
        bookstand = new Bookstand();
        shelf = new Shelf(500);
    }

    @Test
    void addShelf() {
        assertDoesNotThrow(() -> bookstand.addShelf(shelf));
        assertThrows(BookstandException.class, () -> bookstand.addShelf(shelf));
    }

    @Test
    void getShelf() {
        assertThrows(BookstandException.class, () -> bookstand.getShelf(0));
        try {
            bookstand.addShelf(shelf);
            assertEquals(shelf, bookstand.getShelf(0));
        } catch (BookstandException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}
