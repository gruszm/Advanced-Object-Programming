package table;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa BookstandBuilder, służąca do tworzenia obiektów Bookstand za pomocą wzorca Builder.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class BookstandBuilder
{
    private List<Shelf> shelvesList;

    /**
     * Konstruktor klasy BookstandBuilder. Inicjalizuje listę półek.
     */
    public BookstandBuilder()
    {
        this.shelvesList = new ArrayList<>();
    }

    /**
     * Metoda dodająca półkę do konstruowanego Bookstand.
     *
     * @param shelf półka do dodania.
     * @return obiekt klasy BookstandBuilder, umożliwiający dalszą konstrukcję.
     * @throws BookstandException w przypadku, gdy półka już istnieje na liście.
     */
    public BookstandBuilder addShelf(Shelf shelf) throws BookstandException
    {
        if (shelvesList.contains(shelf))
        {
            throw new BookstandException("Ta półka już istnieje w tym budowniczym regału.");
        }
        else
        {
            shelvesList.add(shelf);
            return this;
        }
    }

    /**
     * Metoda zwracająca skonstruowany obiekt klasy Bookstand.
     *
     * @return skonstruowany obiekt klasy Bookstand.
     * @throws BookstandException w przypadku, gdy lista półek jest pusta.
     */
    public Bookstand toBookstand() throws BookstandException
    {
        if (shelvesList.isEmpty())
        {
            throw new BookstandException("Regał musi mieć przynajmniej jedną półkę");
        }
        else
        {
            return new Bookstand(new ArrayList<>(shelvesList));
        }
    }
}
