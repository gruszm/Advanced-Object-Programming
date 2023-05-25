/**
 * Klasa Main, która zawiera metodę main, stanowiącą punkt startowy dla aplikacji.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
package table;

public class Main
{
    /**
     * Główna metoda programu. Tworzy instancję klasy LibraryFacade.
     *
     * @param args argumenty z linii poleceń.
     */
    public static void main(String[] args)
    {
        try {
            LibraryFacade libraryFacade = new LibraryFacade();
        } catch (TableException e) {
            throw new RuntimeException(e);
        }
    }
}
