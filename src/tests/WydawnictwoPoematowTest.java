package tests;

import Factory.Poemat;
import Factory.Wydawnictwo;
import Factory.WydawnictwoPoematow;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WydawnictwoPoematowTest
{
    private Wydawnictwo wydawnictwoPoematow;

    @BeforeEach
    void setUp() {
        wydawnictwoPoematow = new WydawnictwoPoematow("Juliusz Słowacki");
    }

    @Test
    void createBook() {
        Book poemat = wydawnictwoPoematow.createBook("Kordian", 250);

        assertEquals("Juliusz Słowacki", poemat.getAuthor());
        assertEquals("Kordian", poemat.getTitle());
        assertEquals(250, poemat.getPages());
        assertTrue(poemat instanceof Poemat);
    }
}
