package table;

import decoration.BookInterface;

/**
 * Klasa LibraryFacade, udostępniająca złożoną logikę biblioteki poprzez jedno, proste API.
 * Wykorzystuje wzorzec Fasada do ukrywania złożoności systemu.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class LibraryFacade {
    ReadingRoom readingRoom;
    Table table;
    Bookstand bookstand;
    BookstandBuilder bookstandBuilder;

    /**
     * Konstruktor klasy LibraryFacade. Inicjalizuje instancje ReadingRoom, Table, Bookstand i BookstandBuilder.
     *
     * @throws TableException jeśli wystąpi błąd podczas tworzenia instancji Table.
     */
    public LibraryFacade() throws TableException {
        readingRoom = ReadingRoom.getInstance();
        table = readingRoom.getTable();
        bookstand = readingRoom.getBookstand();
        bookstandBuilder = new BookstandBuilder();
    }

    /**
     * Metoda zwraca półkę z biblioteki.
     *
     * @param number numer półki
     * @return instancję półki
     * @throws BookstandException jeżeli podany numer półki jest nieprawidłowy.
     */
    public Shelf getShelf(int number) throws BookstandException {
        return bookstand.getShelf(number);
    }

    /**
     * Metoda przenosząca książkę z półki na stół.
     *
     * @param iShelfNumber numer półki
     * @param jBookNumber numer książki na półce
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli podany numer książki jest nieprawidłowy.
     * @throws TableException jeśli stół nie może pomieścić więcej książek.
     */
    public void transportBookFromShelfToTable(int iShelfNumber, int jBookNumber) throws BookstandException, ShelfException, TableException {
        table.putBook(bookstand.getShelf(iShelfNumber).takeBook(jBookNumber));
    }

    /**
     * Metoda przenosząca książkę ze stołu na półkę.
     *
     * @param iShelfNumber numer półki
     * @throws TableException jeśli stół jest pusty.
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli półka nie może pomieścić więcej książek.
     */
    public void transportBookFromTableToShelf(int iShelfNumber) throws TableException, BookstandException, ShelfException {
        bookstand.getShelf(iShelfNumber).putBook(table.takeBook());
    }

    /**
     * Metoda dodająca książkę na stół.
     *
     * @param bookInterface książka do dodania
     * @throws TableException jeśli stół nie może pomieścić więcej książek.
     */
    public void addBookToTable(BookInterface bookInterface) throws TableException {
        table.putBook(bookInterface);
    }

    /**
     * Metoda pobierająca książkę ze stołu.
     *
     * @return książka pobrana ze stołu
     * @throws TableException jeśli stół jest pusty.
     */
    public BookInterface takeBookFromTable() throws TableException {
        return table.takeBook();
    }

    /**
     * Metoda dodająca książkę do regału.
     *
     * @param bookInterface książka do dodania
     * @param shelfNumber numer półki
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli półka nie może pomieścić więcej książek.
     */
    public void addBookToBookstand(BookInterface bookInterface, int shelfNumber) throws BookstandException, ShelfException {
        bookstand.getShelf(shelfNumber).putBook(bookInterface);
    }

    /**
     * Metoda dodająca książkę do regału na konkretnej pozycji.
     *
     * @param bookInterface książka do dodania
     * @param shelfNumber numer półki
     * @param bookPosition pozycja książki na półce
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli półka nie może pomieścić więcej książek lub jeśli pozycja książki jest nieprawidłowa.
     */
    public void addBookToBookstand(BookInterface bookInterface, int shelfNumber, int bookPosition) throws BookstandException, ShelfException {
        bookstand.getShelf(shelfNumber).putBook(bookInterface, bookPosition);
    }

    /**
     * Metoda pobierająca książkę z regału.
     *
     * @param shelfNumber numer półki
     * @return książka pobrana z regału
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli półka jest pusta.
     */
    public BookInterface getBookFromBookstand(int shelfNumber) throws BookstandException, ShelfException {
        return bookstand.getShelf(shelfNumber).takeBook();
    }

    /**
     * Metoda pobierająca książkę z konkretnego miejsca w regale.
     *
     * @param shelfNumber numer półki
     * @param bookPosition pozycja książki na półce
     * @return książka pobrana z regału
     * @throws BookstandException jeśli podany numer półki jest nieprawidłowy.
     * @throws ShelfException jeśli pozycja książki jest nieprawidłowa.
     */
    public BookInterface getBookFromBookstand(int shelfNumber, int bookPosition) throws BookstandException, ShelfException {
        return bookstand.getShelf(shelfNumber).takeBook(bookPosition);
    }

    /**
     * Metoda dodająca półkę do budowniczego regału.
     *
     * @param shelf półka do dodania
     * @return instancja budowniczego regału
     * @throws BookstandException jeśli półka już istnieje w budowniczym regału.
     */
    public BookstandBuilder addShelf(Shelf shelf) throws BookstandException {
        return bookstandBuilder.addShelf(shelf);
    }

    /**
     * Metoda konwertująca budowniczego regału do regału.
     *
     * @return instancja regału
     * @throws BookstandException jeśli budowniczy regału jest pusty.
     */
    public Bookstand toBookstand() throws BookstandException {
        return bookstandBuilder.toBookstand();
    }
}
