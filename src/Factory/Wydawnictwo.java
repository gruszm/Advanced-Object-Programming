package Factory;

import decoration.Book;

/**
 * Klasa abstrakcyjna Wydawnictwo reprezentuje wydawnictwo książek.
 * Każde konkretne wydawnictwo powinno rozszerzać tę klasę.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public abstract class Wydawnictwo {
    protected String author;

    /**
     * Metoda statyczna getWydawnictwo zwraca obiekt Wydawnictwo na podstawie podanego autora.
     *
     * @param author autor książki
     * @return obiekt Wydawnictwo
     */
    public static Wydawnictwo getWydawnictwo(String author) {
        if (author.equals("Adam Mickiewicz")) {
            return new WydawnictwoPoematow(author);
        } else if (author.equals("Autor Historyczny")) {
            return new WydawnictwoPowiesciHistorycznych(author);
        } else if (author.equals("Autor Medyczny")) {
            return new WydawnictwoThrillerow(author);
        } else {
            throw new RuntimeException("Nieznany autor: " + author);
        }
    }

    /**
     * Metoda abstrakcyjna createBook, która musi zostać zaimplementowana przez klasy rozszerzające.
     *
     * @param title tytuł książki
     * @param pages liczba stron książki
     * @return obiekt klasy Book
     */
    public abstract Book createBook(String title, int pages);

    /**
     * Konstruktor klasy Wydawnictwo.
     *
     * @param author autor książki
     */
    Wydawnictwo(String author) {
        this.author = author;
    }
}
