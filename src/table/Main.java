package table;

import decoration.Book;
import decoration.DecorativeCoverBook;

public class Main
{
    public static void main(String[] args)
    {
        BookstandBuilder rb = new BookstandBuilder();
        try
        {
            rb.addShelf(new Shelf(10000));
            rb.addShelf(new Shelf(5000));
            Bookstand bs = rb.toBookstand(); //Wlasciwy proces tworzenia obiektu Regal.
            System.out.println(bs);
        }
        catch (BookstandException e)
        {
            throw new RuntimeException(e);
        }
    }
}
