package Factory;

import decoration.Book;

/**
 * Klasa WydawnictwoPowiesciHistorycznych służy do tworzenia książek typu PowiescHistoryczna.
 * Rozszerza klasę Wydawnictwo.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class WydawnictwoPowiesciHistorycznych extends Wydawnictwo
{
    /**
     * Konstruktor klasy WydawnictwoPowiesciHistorycznych.
     *
     * @param author autor książek tworzonych przez to wydawnictwo
     */
    public WydawnictwoPowiesciHistorycznych(String author)
    {
        super(author);
    }

    /**
     * Metoda createBook służy do tworzenia nowej książki typu PowiescHistoryczna.
     *
     * @param title tytuł tworzonej książki
     * @param pages liczba stron tworzonej książki
     * @return nowa książka typu PowiescHistoryczna
     */
    @Override
    public Book createBook(String title, int pages)
    {
        return new PowiescHistoryczna(this.author, title, pages);
    }
}
