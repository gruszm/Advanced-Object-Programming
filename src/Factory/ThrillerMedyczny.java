package Factory;

import decoration.Book;

/**
 * Klasa ThrillerMedyczny reprezentuje specyficzny rodzaj książki.
 * Rozszerza klasę Book.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class ThrillerMedyczny extends Book
{
    /**
     * Konstruktor klasy ThrillerMedyczny.
     *
     * @param author autor książki
     * @param title tytuł książki
     * @param pages liczba stron książki
     */
    public ThrillerMedyczny(String author, String title, int pages)
    {
        super(author, title, pages);
    }
}
