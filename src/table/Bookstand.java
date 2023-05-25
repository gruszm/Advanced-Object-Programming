package table;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa Bookstand reprezentuje regał na książki.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class Bookstand
{
    private List<Shelf> shelvesList;

    /**
     * Konstruktor domyślny klasy Bookstand.
     * Tworzy pustą listę półek.
     */
    public Bookstand()
    {
        this.shelvesList = new ArrayList<>();
    }

    /**
     * Konstruktor klasy Bookstand z parametrem.
     *
     * @param shelvesList lista półek
     */
    public Bookstand(List<Shelf> shelvesList)
    {
        this.shelvesList = shelvesList;
    }

    /**
     * Metoda addShelf dodaje półkę do regału.
     *
     * @param shelf półka do dodania
     * @throws BookstandException jeśli półka już istnieje na regale
     */
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

    /**
     * Metoda getShelf zwraca półkę o danym numerze.
     *
     * @param number numer półki
     * @return półka o danym numerze
     * @throws BookstandException jeśli numer półki jest niepoprawny
     */
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
