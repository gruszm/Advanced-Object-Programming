package tests;

import Factory.Wydawnictwo;
import Factory.WydawnictwoPoematow;
import Factory.WydawnictwoPowiesciHistorycznych;
import Factory.WydawnictwoThrillerow;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WydawnictwoTest
{
    private Wydawnictwo wydawnictwoPoematow;
    private Wydawnictwo wydawnictwoPowiesciHistorycznych;
    private Wydawnictwo wydawnictwoThrillerow;

    @BeforeEach
    void setUp() {
        wydawnictwoPoematow = Wydawnictwo.getWydawnictwo("Adam Mickiewicz");
        wydawnictwoPowiesciHistorycznych = Wydawnictwo.getWydawnictwo("Autor Historyczny");
        wydawnictwoThrillerow = Wydawnictwo.getWydawnictwo("Autor Medyczny");
    }

    @Test
    void getWydawnictwo() {
        assertTrue(wydawnictwoPoematow instanceof WydawnictwoPoematow);
        assertTrue(wydawnictwoPowiesciHistorycznych instanceof WydawnictwoPowiesciHistorycznych);
        assertTrue(wydawnictwoThrillerow instanceof WydawnictwoThrillerow);
    }

    @Test
    void createBook() {
        Book poemat = wydawnictwoPoematow.createBook("Pan Tadeusz", 500);
        Book powiescHistoryczna = wydawnictwoPowiesciHistorycznych.createBook("Krzyzacy", 300);
        Book thrillerMedyczny = wydawnictwoThrillerow.createBook("Chromosom 6", 400);

        assertEquals("Adam Mickiewicz", poemat.getAuthor());
        assertEquals("Pan Tadeusz", poemat.getTitle());
        assertEquals(500, poemat.getPages());

        assertEquals("Autor Historyczny", powiescHistoryczna.getAuthor());
        assertEquals("Krzyzacy", powiescHistoryczna.getTitle());
        assertEquals(300, powiescHistoryczna.getPages());

        assertEquals("Autor Medyczny", thrillerMedyczny.getAuthor());
        assertEquals("Chromosom 6", thrillerMedyczny.getTitle());
        assertEquals(400, thrillerMedyczny.getPages());
    }
}
