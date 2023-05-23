package tests;

import Factory.PowiescHistoryczna;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowiescHistorycznaTest {
    private PowiescHistoryczna powiescHistoryczna;

    @BeforeEach
    void setUp() {
        powiescHistoryczna = new PowiescHistoryczna("Henryk Sienkiewicz", "Krzyżacy", 720);
    }

    @AfterEach
    void tearDown() {
        powiescHistoryczna = null;
    }

    @Test
    void testToString() {
        String expected = "| Henryk Sienkiewicz | Krzyżacy | 720 |";
        String actual = powiescHistoryczna.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Henryk Sienkiewicz", powiescHistoryczna.getAuthor());
    }

    @Test
    void setAuthor() {
        powiescHistoryczna.setAuthor("Andrzej Sapkowski");
        assertEquals("Andrzej Sapkowski", powiescHistoryczna.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Krzyżacy", powiescHistoryczna.getTitle());
    }

    @Test
    void setTitle() {
        powiescHistoryczna.setTitle("Wiedźmin");
        assertEquals("Wiedźmin", powiescHistoryczna.getTitle());
    }
    @Test
    void getPages() {
        assertEquals(720, powiescHistoryczna.getPages());
    }

    @Test
    void setPages() {
        powiescHistoryczna.setPages(900);
        assertEquals(900, powiescHistoryczna.getPages());
    }
}
