package tests;

import Factory.PowiescHistoryczna;
import Factory.Wydawnictwo;
import Factory.WydawnictwoPowiesciHistorycznych;
import decoration.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WydawnictwoPowiesciHistorycznychTest
{
    private Wydawnictwo wydawnictwoPowiesciHistorycznych;

    @BeforeEach
    void setUp() {
        wydawnictwoPowiesciHistorycznych = new WydawnictwoPowiesciHistorycznych("Autor Historyczny");
    }

    @Test
    void createBook() {
        Book powiescHistoryczna = wydawnictwoPowiesciHistorycznych.createBook("Powieść historyczna", 500);

        assertEquals("Autor Historyczny", powiescHistoryczna.getAuthor());
        assertEquals("Powieść historyczna", powiescHistoryczna.getTitle());
        assertEquals(500, powiescHistoryczna.getPages());
        assertTrue(powiescHistoryczna instanceof PowiescHistoryczna);
    }
}
