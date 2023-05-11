package table;

import decoration.Book;
import decoration.BookInterface;
import org.junit.jupiter.api.Assertions;

class TableTest
{
    Table table;
    BookInterface book;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        try
        {
            table = new Table(1);
        }
        catch (Exception e)
        {

        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {
    }

    @org.junit.jupiter.api.Test
    void putBook()
    {
        TableException thrown = Assertions.assertThrows(TableException.class,
                () ->
                {
                    BookInterface b1 = new Book("1", "2", 3);
                    BookInterface b2 = new Book("3", "4", 5);
                    table.putBook(b1);
                    table.putBook(b2);
                }
        );

        Assertions.assertEquals("Table is full", thrown.getMessage());
    }

    @org.junit.jupiter.api.Test
    void peek()
    {
    }

    @org.junit.jupiter.api.Test
    void takeBook()
    {
    }

    @org.junit.jupiter.api.Test
    void getStack()
    {
    }

    @org.junit.jupiter.api.Test
    void getM()
    {
    }

    @org.junit.jupiter.api.Test
    void testToString()
    {
    }
}