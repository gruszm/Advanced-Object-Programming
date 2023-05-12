package table;

import decoration.Book;

public class ReadingRoom
{
    private static int tableCapacity = 10000;
    private static ReadingRoom instance;
    private Table table;
    private Bookstand bookstand;

    private ReadingRoom() throws TableException {
        table = new Table(tableCapacity);
        bookstand = new Bookstand();
    }

    public static ReadingRoom getInstance() throws TableException
    {
        if (instance == null)
        {
            instance = new ReadingRoom();
        }

        return instance;
    }

    public static void setTableCapacity(int newTableCapacity)
    {
        tableCapacity = newTableCapacity;
    }

    public Table getTable()
    {
        return table;
    }

    public Bookstand getBookstand()
    {
        return bookstand;
    }
}
