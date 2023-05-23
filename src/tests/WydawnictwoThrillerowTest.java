package tests;

import Factory.ThrillerMedyczny;
import Factory.Wydawnictwo;
import Factory.WydawnictwoThrillerow;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WydawnictwoThrillerowTest
{
    private Wydawnictwo wydawnictwoThrillerow;

    @BeforeEach
    void setUp() {
        wydawnictwoThrillerow = new WydawnictwoThrillerow("Autor Medyczny");
    }

    @Test
    void createBook() {
        Book thrillerMedyczny = wydawnictwoThrillerow.createBook("Thriller Medyczny", 300);

        assertEquals("Autor Medyczny", thrillerMedyczny.getAuthor());
        assertEquals("Thriller Medyczny", thrillerMedyczny.getTitle());
        assertEquals(300, thrillerMedyczny.getPages());
        assertTrue(thrillerMedyczny instanceof ThrillerMedyczny);
    }
}
