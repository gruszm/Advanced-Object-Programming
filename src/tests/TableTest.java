package tests;

import decoration.Book;
import decoration.BookInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import table.Table;
import table.TableException;

import static org.junit.jupiter.api.Assertions.*;

class TableTest
{
    private Table table;
    private BookInterface book1;
    private BookInterface book2;

    @BeforeEach
    void setUp() throws TableException
    {
        table = new Table(2);
        book1 = new Book("Author1", "Title1", 200);
        book2 = new Book("Author2", "Title2", 300);
    }

    @AfterEach
    void tearDown()
    {
        table = null;
        book1 = null;
        book2 = null;
    }

    @Test
    void putBook() throws TableException
    {
        table.putBook(book1);
        assertEquals(book1, table.peek());
    }

    @Test
    void peek() throws TableException
    {
        table.putBook(book1);
        assertEquals(book1, table.peek());
    }

    @Test
    void takeBook() throws TableException
    {
        table.putBook(book1);
        assertEquals(book1, table.takeBook());
    }

    @Test
    void getStack() throws TableException
    {
        table.putBook(book1);
        assertEquals(1, table.getStack().size());
        assertEquals(book1, table.getStack().peek());
    }

    @Test
    void getM()
    {
        assertEquals(2, table.getM());
    }

    @Test
    void testToString() throws TableException
    {
        table.putBook(book1);
        table.putBook(book2);
        String expected = String.format("| %s | %s | %d |\n| %s | %s | %d |",
                book1.getAuthor(), book1.getTitle(), book1.getPages(),
                book2.getAuthor(), book2.getTitle(), book2.getPages()).replaceAll("\\s", "");

        System.out.println("Expected:\n" + expected); // wydrukuj oczekiwany wynik
        System.out.println("Actual:\n" + table.toString().replaceAll("\\s", "")); // wydrukuj faktyczny wynik

        assertEquals(expected, table.toString().replaceAll("\\s", ""));
    }
}
