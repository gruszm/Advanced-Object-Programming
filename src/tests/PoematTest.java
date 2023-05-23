package tests;

import Factory.Poemat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoematTest {
    private Poemat poemat;

    @BeforeEach
    void setUp() {
        poemat = new Poemat("Juliusz Słowacki", "Balladyna", 110);
    }

    @AfterEach
    void tearDown() {
        poemat = null;
    }

    @Test
    void testToString() {
        String expected = "| Juliusz Słowacki | Balladyna | 110 |";
        String actual = poemat.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        assertEquals("Juliusz Słowacki", poemat.getAuthor());
    }

    @Test
    void setAuthor() {
        poemat.setAuthor("Czesław Miłosz");
        assertEquals("Czesław Miłosz", poemat.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("Balladyna", poemat.getTitle());
    }

    @Test
    void setTitle() {
        poemat.setTitle("Wiersze");
        assertEquals("Wiersze", poemat.getTitle());
    }

    @Test
    void getPages() {
        assertEquals(110, poemat.getPages());
    }

    @Test
    void setPages() {
        poemat.setPages(150);
        assertEquals(150, poemat.getPages());
    }
}
