package Factory;

import decoration.Book;

/**
 * Klasa Poemat reprezentuje specyficzny rodzaj książki.
 * Rozszerza klasę Book.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class Poemat extends Book
{
    /**
     * Konstruktor klasy Poemat.
     *
     * @param author autor książki
     * @param title tytuł książki
     * @param pages liczba stron książki
     */
    public Poemat(String author, String title, int pages)
    {
        super(author, title, pages);
    }
}
