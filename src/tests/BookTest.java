package tests;

import decoration.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Adam Mickiewicz", "Dziady", 130);
    }

    @AfterEach
    void tearDown() {
        book = null;
    }

    @Test
    void testToString() {
        String expected = "| Adam Mickiewicz | Dziady | 130 |";
        String actual = book.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Adam Mickiewicz", book.getAuthor());
    }

    @Test
    void setAuthor() {
        book.setAuthor("Henryk Sienkiewicz");
        assertEquals("Henryk Sienkiewicz", book.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Dziady", book.getTitle());
    }

    @Test
    void setTitle() {
        book.setTitle("Quo Vadis");
        assertEquals("Quo Vadis", book.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(130, book.getPages());
    }

    @Test
    void setPages() {
        book.setPages(200);
        assertEquals(200, book.getPages());
    }
}
