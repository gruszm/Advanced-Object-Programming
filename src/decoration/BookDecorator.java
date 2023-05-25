package decoration;

/**
 * Klasa abstrakcyjna BookDecorator służy jako podstawa dla konkretnych dekoratorów książek.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public abstract class BookDecorator implements BookInterface {
    protected BookInterface decoratedBook;

    /**
     * Konstruktor klasy BookDecorator.
     *
     * @param decoratedBook książka, która ma być dekorowana.
     */
    public BookDecorator(BookInterface decoratedBook)
    {
        this.decoratedBook = decoratedBook;
    }
}
