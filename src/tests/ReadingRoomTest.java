package tests;

import decoration.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.ReadingRoom;
import table.TableException;

import static org.junit.jupiter.api.Assertions.*;

class ReadingRoomTest {
    ReadingRoom readingRoom;

    @BeforeEach
    void setUp() throws TableException
    {
        ReadingRoom.setTableCapacity(100);
        readingRoom = ReadingRoom.getInstance();
    }

    @AfterEach
    void tearDown() {
        readingRoom = null;
    }

    @Test
    void getInstance() throws TableException {
        assertNotNull(readingRoom, "ReadingRoom instance should not be null");
        assertEquals(readingRoom, ReadingRoom.getInstance(), "getInstance should always return the same instance");
    }

    @Test
    void setTableCapacity() throws TableException {
        ReadingRoom.setTableCapacity(200);
        ReadingRoom.resetInstance(); // Dodano tę linię
        readingRoom = ReadingRoom.getInstance();
        assertEquals(200, readingRoom.getTable().getM(), "Table capacity should be updated to the new value");
    }

    @Test
    void getTable() {
        assertNotNull(readingRoom.getTable(), "Table instance should not be null");
    }

    @Test
    void getBookstand() {
        assertNotNull(readingRoom.getBookstand(), "Bookstand instance should not be null");
    }
}
