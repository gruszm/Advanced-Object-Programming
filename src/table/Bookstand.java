package table;

import java.util.ArrayList;
import java.util.List;

public class Bookstand
{
    private List<Shelf> shelvesList;

    public Bookstand()
    {
        this.shelvesList = new ArrayList<>();
    }

    public Bookstand(List<Shelf> shelvesList)
    {
        this.shelvesList = shelvesList;
    }

    public void addShelf(Shelf shelf) throws BookstandException
    {
        if (shelvesList.contains(shelf))
        {
            throw new BookstandException("This shelf already exists on this bookstand.");
        }
        else
        {
            shelvesList.add(shelf);
        }
    }

    public Shelf getShelf(int number) throws BookstandException
    {
        if (number < 0 || number >= shelvesList.size())
        {
            throw new BookstandException("Incorrect shelf number.");
        }
        else
        {
            return shelvesList.get(number);
        }
    }
}
