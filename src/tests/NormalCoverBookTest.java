package tests;

import decoration.Book;
import decoration.NormalCoverBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalCoverBookTest {
    private NormalCoverBook normalCoverBook;

    @BeforeEach
    void setUp() {
        Book book = new Book("Adam Mickiewicz", "Dziady", 130);
        normalCoverBook = new NormalCoverBook(book);
    }

    @AfterEach
    void tearDown() {
        normalCoverBook = null;
    }

    @Test
    void testToString() {
        String expected = "( | Adam Mickiewicz | Dziady | 130 | )";
        String actual = normalCoverBook.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Adam Mickiewicz", normalCoverBook.getAuthor());
    }

    @Test
    void setAuthor() {
        normalCoverBook.setAuthor("Henryk Sienkiewicz");
        assertEquals("Henryk Sienkiewicz", normalCoverBook.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Dziady", normalCoverBook.getTitle());
    }

    @Test
    void setTitle() {
        normalCoverBook.setTitle("Quo Vadis");
        assertEquals("Quo Vadis", normalCoverBook.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(130, normalCoverBook.getPages());
    }

    @Test
    void setPages() {
        normalCoverBook.setPages(200);
        assertEquals(200, normalCoverBook.getPages());
    }
}
