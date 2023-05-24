package table;

import decoration.BookInterface;

public class LibraryFacade {
    ReadingRoom readingRoom;
    Table table;

    Bookstand bookstand;
    BookstandBuilder bookstandBuilder;

    public LibraryFacade() throws TableException {
        readingRoom = ReadingRoom.getInstance();
        table = readingRoom.getTable();
        bookstand = readingRoom.getBookstand();

        bookstandBuilder = new BookstandBuilder();
    }

    public Bookstand getBookstand()
    {
        return bookstand;
    }

    public Shelf getShelf(int number) throws BookstandException {
        return bookstand.getShelf(number);
    }

    public void transportBookFromShelfToTable(int iShelfNumber, int jBookNumber) throws BookstandException, ShelfException, TableException {
        table.putBook(bookstand.getShelf(iShelfNumber).takeBook(jBookNumber));
    }

    public void transportBookFromTableToShelf(int iShelfNumber) throws TableException, BookstandException, ShelfException {
        bookstand.getShelf(iShelfNumber).putBook(table.takeBook());
    }

    public void addBookToTable(BookInterface bookInterface) throws TableException {
        table.putBook(bookInterface);
    }

    public BookInterface takeBookFromTable() throws TableException {
        return table.takeBook();
    }

    public void addBookToBookstand(BookInterface bookInterface, int shelfNumber) throws BookstandException, ShelfException {
        bookstand.getShelf(shelfNumber).putBook(bookInterface);
    }

    public void addBookToBookstand(BookInterface bookInterface, int shelfNumber, int bookPosition) throws BookstandException, ShelfException {
        bookstand.getShelf(shelfNumber).putBook(bookInterface, bookPosition);
    }

    public BookInterface getBookFromBookstand(int shelfNumber) throws BookstandException, ShelfException {
        return bookstand.getShelf(shelfNumber).takeBook();
    }

    public BookInterface getBookFromBookstand(int shelfNumber, int bookPosition) throws BookstandException, ShelfException {
        return bookstand.getShelf(shelfNumber).takeBook(bookPosition);
    }

    public BookstandBuilder addShelf(Shelf shelf) throws BookstandException {
        return bookstandBuilder.addShelf(shelf);
    }

    public Bookstand toBookstand() throws BookstandException {
        return bookstandBuilder.toBookstand();
    }
}
