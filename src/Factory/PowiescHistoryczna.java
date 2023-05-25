package Factory;

import decoration.Book;

/**
 * Klasa PowiescHistoryczna reprezentuje specyficzny rodzaj książki.
 * Rozszerza klasę Book.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class PowiescHistoryczna extends Book
{
    /**
     * Konstruktor klasy PowiescHistoryczna.
     *
     * @param author autor książki
     * @param title tytuł książki
     * @param pages liczba stron książki
     */
    public PowiescHistoryczna(String author, String title, int pages)
    {
        super(author, title, pages);
    }
}
