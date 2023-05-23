package tests;

import decoration.Book;
import decoration.DecorativeCoverBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecorativeCoverBookTest {
    private DecorativeCoverBook decorativeCoverBook;

    @BeforeEach
    void setUp() {
        Book book = new Book("Adam Mickiewicz", "Dziady", 130);
        decorativeCoverBook = new DecorativeCoverBook(book);
    }

    @AfterEach
    void tearDown() {
        decorativeCoverBook = null;
    }

    @Test
    void testToString() {
        String expected = "{ [ | Adam Mickiewicz | Dziady | 130 | ] }";
        String actual = decorativeCoverBook.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Adam Mickiewicz", decorativeCoverBook.getAuthor());
    }

    @Test
    void setAuthor() {
        decorativeCoverBook.setAuthor("Henryk Sienkiewicz");
        assertEquals("Henryk Sienkiewicz", decorativeCoverBook.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Dziady", decorativeCoverBook.getTitle());
    }

    @Test
    void setTitle() {
        decorativeCoverBook.setTitle("Quo Vadis");
        assertEquals("Quo Vadis", decorativeCoverBook.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(130, decorativeCoverBook.getPages());
    }

    @Test
    void setPages() {
        decorativeCoverBook.setPages(200);
        assertEquals(200, decorativeCoverBook.getPages());
    }
}
