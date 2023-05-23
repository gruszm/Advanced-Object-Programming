package tests;

import decoration.Book;
import decoration.SolidCoverBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolidCoverBookTest {
    private SolidCoverBook solidCoverBook;

    @BeforeEach
    void setUp() {
        Book book = new Book("Adam Mickiewicz", "Dziady", 130);
        solidCoverBook = new SolidCoverBook(book);
    }

    @AfterEach
    void tearDown() {
        solidCoverBook = null;
    }

    @Test
    void testToString() {
        String expected = "[ | Adam Mickiewicz | Dziady | 130 | ]";
        String actual = solidCoverBook.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Adam Mickiewicz", solidCoverBook.getAuthor());
    }

    @Test
    void setAuthor() {
        solidCoverBook.setAuthor("Henryk Sienkiewicz");
        assertEquals("Henryk Sienkiewicz", solidCoverBook.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Dziady", solidCoverBook.getTitle());
    }

    @Test
    void setTitle() {
        solidCoverBook.setTitle("Quo Vadis");
        assertEquals("Quo Vadis", solidCoverBook.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(130, solidCoverBook.getPages());
    }

    @Test
    void setPages() {
        solidCoverBook.setPages(200);
        assertEquals(200, solidCoverBook.getPages());
    }
}
