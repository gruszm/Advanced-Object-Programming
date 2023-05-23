package tests;

import Factory.ThrillerMedyczny;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThrillerMedycznyTest
{
    private ThrillerMedyczny thrillerMedyczny;

    @BeforeEach
    void setUp() {
        thrillerMedyczny = new ThrillerMedyczny("Robin Cook", "Chromosom 6", 400);
    }

    @Test
    void testToString() {
        assertEquals("| Robin Cook | Chromosom 6 | 400 |", thrillerMedyczny.toString());
    }

    @Test
    void getAuthor() {
        assertEquals("Robin Cook", thrillerMedyczny.getAuthor());
    }

    @Test
    void setAuthor() {
        thrillerMedyczny.setAuthor("Michael Crichton");
        assertEquals("Michael Crichton", thrillerMedyczny.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Chromosom 6", thrillerMedyczny.getTitle());
    }

    @Test
    void setTitle() {
        thrillerMedyczny.setTitle("Ziarno prawdy");
        assertEquals("Ziarno prawdy", thrillerMedyczny.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(400, thrillerMedyczny.getPages());
    }

    @Test
    void setPages() {
        thrillerMedyczny.setPages(500);
        assertEquals(500, thrillerMedyczny.getPages());
    }
}
