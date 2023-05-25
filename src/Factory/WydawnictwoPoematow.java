package Factory;

import decoration.Book;

/**
 * Klasa WydawnictwoPoematow reprezentuje wydawnictwo tworzące poematy.
 * Rozszerza klasę Wydawnictwo.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class WydawnictwoPoematow extends Wydawnictwo {

    /**
     * Konstruktor klasy WydawnictwoPoematow.
     *
     * @param author autor poematu
     */
    public WydawnictwoPoematow(String author) {
        super(author);
    }

    /**
     * Metoda createBook tworzy nową książkę typu Poemat.
     *
     * @param title tytuł książki
     * @param pages liczba stron książki
     * @return nowy obiekt typu Poemat
     */
    @Override
    public Book createBook(String title, int pages) {
        return new Poemat(this.author, title, pages);
    }
}
