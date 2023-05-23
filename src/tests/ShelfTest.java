package tests;

import decoration.Book;
import decoration.BookInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.Shelf;
import table.ShelfException;

import static org.junit.jupiter.api.Assertions.*;

class ShelfTest
{
    private Shelf shelf;
    private BookInterface book1;
    private BookInterface book2;

    @BeforeEach
    void setUp()
    {
        shelf = new Shelf(500);
        book1 = new Book("Author1", "Title1", 200);
        book2 = new Book("Author2", "Title2", 300);
    }

    @AfterEach
    void tearDown()
    {
        shelf = null;
        book1 = null;
        book2 = null;
    }

    @Test
    void putBook() throws ShelfException
    {
        shelf.putBook(book1);
        assertEquals(book1, shelf.takeBook());
    }

    @Test
    void testPutBookWithPosition() throws ShelfException
    {
        shelf.putBook(book1);
        shelf.putBook(book2, 1);
        assertEquals(book1, shelf.takeBook(0));
        assertEquals(book2, shelf.takeBook(1));
    }

    @Test
    void takeBook() throws ShelfException
    {
        shelf.putBook(book1);
        assertEquals(book1, shelf.takeBook());
    }

    @Test
    void testTakeBookWithPosition() throws ShelfException
    {
        shelf.putBook(book1);
        shelf.putBook(book2);
        assertEquals(book1, shelf.takeBook(0));
        assertEquals(book2, shelf.takeBook(1));
    }

    @Test
    void testToString() throws ShelfException
    {
        shelf.putBook(book1);
        shelf.putBook(book2);
        String expected = "1. | Author1 | Title1 | 200 |\n2. | Author2 | Title2 | 300 |";
        assertEquals(expected, shelf.toString());
    }
}
