package decoration;

/**
 * Interfejs BookInterface służy do definiowania kontraktu dla książek i ich dekoratorów.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public interface BookInterface {

    /**
     * Metoda toString powinna służyć do reprezentacji obiektu jako String.
     *
     * @return String reprezentujący obiekt.
     */
    @Override
    public String toString();

    /**
     * Metoda getAuthor powinna służyć do pobierania autora.
     *
     * @return String reprezentujący autora.
     */
    public String getAuthor();

    /**
     * Metoda setAuthor powinna służyć do ustawiania autora.
     *
     * @param author String reprezentujący nowego autora.
     */
    public void setAuthor(String author);

    /**
     * Metoda getTitle powinna służyć do pobierania tytułu.
     *
     * @return String reprezentujący tytuł.
     */
    public String getTitle();

    /**
     * Metoda setTitle powinna służyć do ustawiania tytułu.
     *
     * @param title String reprezentujący nowy tytuł.
     */
    public void setTitle(String title);

    /**
     * Metoda getPages powinna służyć do pobierania liczby stron.
     *
     * @return int reprezentujący liczbę stron.
     */
    public int getPages();

    /**
     * Metoda setPages powinna służyć do ustawiania liczby stron.
     *
     * @param pages int reprezentujący nową liczbę stron.
     */
    public void setPages(int pages);
}
