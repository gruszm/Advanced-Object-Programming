package table;

import java.util.ArrayList;
import java.util.List;

public class BookstandBuilder
{
    private List<Shelf> shelvesList;

    public BookstandBuilder()
    {
        this.shelvesList = new ArrayList<>();
    }

    public BookstandBuilder addShelf(Shelf shelf) throws BookstandException
    {
        if (shelvesList.contains(shelf))
        {
            throw new BookstandException("This shelf already exists on this bookstand builder.");
        }
        else
        {
            shelvesList.add(shelf);
            return this;
        }
    }

    public Bookstand toBookstand() throws BookstandException
    {
        if (shelvesList.isEmpty())
        {
            throw new BookstandException("A bookstand must have at least one shelf");
        }
        else
        {
            return new Bookstand(new ArrayList<>(shelvesList));
        }
    }
}
