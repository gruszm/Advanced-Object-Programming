package table;

/**
 * Klasa BookstandException, reprezentująca wyjątki związane z operacjami na obiektach klasy Bookstand.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class BookstandException extends Exception
{
    /**
     * Konstruktor klasy BookstandException.
     *
     * @param message komunikat wyjątku.
     */
    public BookstandException(String message)
    {
        super(message);
    }
}
