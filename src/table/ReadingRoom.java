/**
 * Klasa ReadingRoom reprezentuje pomieszczenie z pojedynczym stołem i regałem na książki.
 * Używa wzorca Singleton, aby zapewnić tylko jedną instancję klasy ReadingRoom.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
package table;

public class ReadingRoom
{
    private static int tableCapacity = 10000;
    private static ReadingRoom instance;
    private Table table;
    private Bookstand bookstand;

    /**
     * Prywatny konstruktor tworzący nowy obiekt klasy Table i Bookstand.
     *
     * @throws TableException jeśli stół nie może zostać utworzony.
     */
    private ReadingRoom() throws TableException {
        table = new Table(tableCapacity);
        bookstand = new Bookstand();
    }

    /**
     * Metoda statyczna zwracająca instancję klasy ReadingRoom.
     * Jeśli instancja nie istnieje, tworzy nową.
     *
     * @return instancja klasy ReadingRoom.
     * @throws TableException jeśli instancja nie może zostać utworzona.
     */
    public static ReadingRoom getInstance() throws TableException
    {
        if (instance == null)
        {
            instance = new ReadingRoom();
        }

        return instance;
    }

    /**
     * Metoda statyczna ustawiająca pojemność stołu.
     *
     * @param newTableCapacity nowa pojemność stołu.
     */
    public static void setTableCapacity(int newTableCapacity)
    {
        tableCapacity = newTableCapacity;
    }

    /**
     * Metoda zwracająca stół.
     *
     * @return stół w czytelni.
     */
    public Table getTable()
    {
        return table;
    }

    /**
     * Metoda zwracająca regał na książki.
     *
     * @return regał na książki w czytelni.
     */
    public Bookstand getBookstand()
    {
        return bookstand;
    }

    /**
     * Metoda statyczna resetująca instancję klasy ReadingRoom.
     */
    public static void resetInstance() {
        instance = null;
    }
}
