package Factory;

import decoration.Book;

/**
 * Klasa WydawnictwoThrillerow reprezentuje wydawnictwo tworzące thrillery.
 * Rozszerza klasę Wydawnictwo.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class WydawnictwoThrillerow extends Wydawnictwo {

    /**
     * Konstruktor klasy WydawnictwoThrillerow.
     *
     * @param author autor thrillera
     */
    public WydawnictwoThrillerow(String author) {
        super(author);
    }

    /**
     * Metoda createBook tworzy nową książkę typu ThrillerMedyczny.
     *
     * @param title tytuł książki
     * @param pages liczba stron książki
     * @return nowy obiekt typu ThrillerMedyczny
     */
    @Override
    public Book createBook(String title, int pages) {
        return new ThrillerMedyczny(this.author, title, pages);
    }
}
