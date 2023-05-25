package decoration;

/**
 * Klasa Book reprezentuje książkę, która może być dekorowana.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class Book implements BookInterface {
    private String author;
    private String title;
    private int pages;

    /**
     * Konstruktor klasy Book.
     *
     * @param author String reprezentujący autora książki.
     * @param title String reprezentujący tytuł książki.
     * @param pages int reprezentujący liczbę stron książki.
     */
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    /**
     * Metoda toString służy do reprezentacji książki jako String.
     *
     * @return String reprezentujący książkę.
     */
    @Override
    public String toString() {
        return String.format("| %s | %s | %d |", this.author, this.title, this.pages);
    }

    /**
     * Metoda getAuthor służy do pobierania autora książki.
     *
     * @return String reprezentujący autora książki.
     */
    @Override
    public String getAuthor() {
        return this.author;
    }

    /**
     * Metoda setAuthor służy do ustawiania autora książki.
     *
     * @param author String reprezentujący nowego autora książki.
     */
    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Metoda getTitle służy do pobierania tytułu książki.
     *
     * @return String reprezentujący tytuł książki.
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Metoda setTitle służy do ustawiania tytułu książki.
     *
     * @param title String reprezentujący nowy tytuł książki.
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Metoda getPages służy do pobierania liczby stron książki.
     *
     * @return int reprezentujący liczbę stron książki.
     */
    @Override
    public int getPages() {
        return this.pages;
    }

    /**
     * Metoda setPages służy do ustawiania liczby stron książki.
     *
     * @param pages int reprezentujący nową liczbę stron książki.
     */
    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }
}
