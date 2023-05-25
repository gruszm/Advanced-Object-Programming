package table;

/**
 * Klasa ShelfException reprezentuje specyficzny typ wyjątku związanego z półkami.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class ShelfException extends Exception
{
    /**
     * Konstruktor klasy ShelfException.
     *
     * @param message komunikat wyjątku
     */
    public ShelfException(String message)
    {
        super(message);
    }
}
