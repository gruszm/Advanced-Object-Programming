package decoration;

/**
 * Klasa DecorativeCoverBook służy do dekorowania książki ozdobną okładką.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class DecorativeCoverBook extends BookDecorator {

    /**
     * Konstruktor klasy DecorativeCoverBook.
     *
     * @param decoratedBook książka, która ma być dekorowana.
     */
    public DecorativeCoverBook(BookInterface decoratedBook) {
        super(decoratedBook);
    }

    /**
     * Metoda toString służy do reprezentacji dekorowanej książki jako String.
     *
     * @return String reprezentujący dekorowaną książkę.
     */
    @Override
    public String toString() {
        return "{ [ " + decoratedBook.toString() + " ] }";
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
     * @param author String reprezentujący nowego autora dekorowanej książki.
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
     * @param title String reprezentujący nowy tytuł dekorowanej książki.
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
     * @param pages int reprezentujący nową liczbę stron dekorowanej książki.
     */
    @Override
    public void setPages(int pages) {
        decoratedBook.setPages(pages);
    }
}
