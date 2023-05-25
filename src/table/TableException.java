package table;

/**
 * Klasa TableException reprezentuje wyjątki powiązane z klasą Table.
 * Rozszerza klasę Exception.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class TableException extends Exception
{
    /**
     * Konstruktor klasy TableException.
     *
     * @param exceptionMessage wiadomość wyjątku
     */
    public TableException(String exceptionMessage)
    {
        super(exceptionMessage);
    }
}
