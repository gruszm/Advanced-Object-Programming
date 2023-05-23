package tests;

import decoration.BookInterface;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.Bookstand;
import table.BookstandBuilder;
import table.BookstandException;
import table.Shelf;

import static org.junit.jupiter.api.Assertions.*;

class BookstandBuilderTest
{
    private BookstandBuilder builder;
    private Shelf shelf;

    @BeforeEach
    void setUp() {
        builder = new BookstandBuilder();
        shelf = new Shelf(500);
    }

    @Test
    void addShelf() {
        assertDoesNotThrow(() -> builder.addShelf(shelf));
        assertThrows(BookstandException.class, () -> builder.addShelf(shelf));
    }

    @Test
    void toBookstand() {
        assertThrows(BookstandException.class, () -> builder.toBookstand());
        try {
            builder.addShelf(shelf);
            Bookstand bookstand = builder.toBookstand();
            assertNotNull(bookstand);
            assertEquals(shelf, bookstand.getShelf(0));
        } catch (BookstandException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}
