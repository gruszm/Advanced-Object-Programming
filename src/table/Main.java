package table;

import decoration.Book;
import decoration.DecorativeCoverBook;

public class Main
{
    public static void main(String[] args)
    {
        try {
            LibraryFacade libraryFacade = new LibraryFacade();
        } catch (TableException e) {
            throw new RuntimeException(e);
        }
    }
}
