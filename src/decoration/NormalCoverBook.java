package decoration;

/**
 * Klasa NormalCoverBook dekoruje książki, dodając do nich normalną okładkę.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class NormalCoverBook extends BookDecorator {

    /**
     * Konstruktor klasy NormalCoverBook.
     *
     * @param decoratedBook książka, która ma być dekorowana.
     */
    public NormalCoverBook(BookInterface decoratedBook) {
        super(decoratedBook);
    }

    /**
     * Metoda toString służy do reprezentacji książki z normalną okładką jako String.
     *
     * @return String reprezentujący książkę z normalną okładką.
     */
    @Override
    public String toString() {
        return "( " + decoratedBook.toString() + " )";
    }

    /**
     * Metoda getAuthor służy do pobierania autora dekorowanej książki.
     *
     * @return String reprezentujący autora dekorowanej książki.
     */
    @Override
    public String getAuthor() {
        return decoratedBook.getAuthor();
    }

    /**
     * Metoda setAuthor służy do ustawiania autora dekorowanej książki.
     *
     * @param author String reprezentujący nowego autora książki.
     */
    @Override
    public void setAuthor(String author) {
        decoratedBook.setAuthor(author);
    }

    /**
     * Metoda getTitle służy do pobierania tytułu dekorowanej książki.
     *
     * @return String reprezentujący tytuł dekorowanej książki.
     */
    @Override
    public String getTitle() {
        return decoratedBook.getTitle();
    }

    /**
     * Metoda setTitle służy do ustawiania tytułu dekorowanej książki.
     *
     * @param title String reprezentujący nowy tytuł książki.
     */
    @Override
    public void setTitle(String title) {
        decoratedBook.setTitle(title);
    }

    /**
     * Metoda getPages służy do pobierania liczby stron dekorowanej książki.
     *
     * @return int reprezentujący liczbę stron dekorowanej książki.
     */
    @Override
    public int getPages() {
        return decoratedBook.getPages();
    }

    /**
     * Metoda setPages służy do ustawiania liczby stron dekorowanej książki.
     *
     * @param pages int reprezentujący nową liczbę stron książki.
     */
    @Override
    public void setPages(int pages) {
        decoratedBook.setPages(pages);
    }
}
