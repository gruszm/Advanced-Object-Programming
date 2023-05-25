package table;

import decoration.BookInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa Shelf reprezentuje półkę na książki. Półka ma maksymalną liczbę stron, które może pomieścić.
 */
public class Shelf
{
    private List<BookInterface> booksList;
    private final int maxPages;

    /**
     * Konstruktor klasy Shelf.
     *
     * @param maxPages maksymalna liczba stron, które półka może pomieścić
     */
    public Shelf(int maxPages)
    {
        this.booksList = new ArrayList<>();
        this.maxPages = maxPages;
    }

    /**
     * Metoda obliczająca sumę stron książek na półce.
     *
     * @return suma stron książek na półce
     */
    private int sumPages()
    {
        int sum = 0;

        for (BookInterface b : booksList)
        {
            sum += b.getPages();
        }

        return sum;
    }

    /**
     * Metoda pozwalająca na dodanie książki na półkę.
     *
     * @param book książka do dodania na półkę
     * @throws ShelfException jeśli suma stron przekroczy maxPages
     */
    public void putBook(BookInterface book) throws ShelfException
    {
        if (sumPages() + book.getPages() > maxPages)
        {
            throw new ShelfException("Max number of pages exceeded.");
        }
        else
        {
            booksList.add(book);
        }
    }

    /**
     * Metoda pozwalająca na dodanie książki na określoną pozycję na półce.
     *
     * @param book książka do dodania na półkę
     * @param position pozycja, na której książka ma być umieszczona
     * @throws ShelfException jeśli pozycja jest niepoprawna
     */
    public void putBook(BookInterface book, int position) throws ShelfException
    {
        if (position == 0 || position > booksList.size())
        {
            throw new ShelfException("A book can only be added between other books or at the end.");
        }
        else
        {
            booksList.add(position, book);
        }
    }

    /**
     * Metoda pozwalająca na pobranie pierwszej książki z półki.
     *
     * @return pierwsza książka na półce
     * @throws ShelfException jeśli półka jest pusta
     */
    public BookInterface takeBook() throws ShelfException
    {
        if (booksList.isEmpty())
        {
            throw new ShelfException("This shelf is empty.");
        }
        else
        {
            return booksList.get(0);
        }
    }

    /**
     * Metoda pozwalająca na pobranie książki z określonej pozycji na półce.
     *
     * @param position pozycja książki do pobrania
     * @return książka na określonej pozycji
     * @throws ShelfException jeśli pozycja jest niepoprawna
     */
    public BookInterface takeBook(int position) throws ShelfException
    {
        if (booksList.isEmpty())
        {
            throw new ShelfException("This shelf is empty.");
        }
        else if (position >= booksList.size())
        {
            throw new ShelfException("Index out of range for book position.");
        }
        else
        {
            return booksList.get(position);
        }
    }

    /**
     * Metoda konwertująca obiekt klasy Shelf na string.
     *
     * @return tekstowa reprezentacja obiektu klasy Shelf
     */
    @Override
    public String toString()
    {
        StringBuilder shelfAsText = new StringBuilder();

        for (int i = 0; i < booksList.size(); i++)
        {
            shelfAsText.append(String.format("%d. %s", (i + 1), booksList.get(i)));

            if (i < booksList.size() - 1)
            {
                shelfAsText.append('\n');
            }
        }

        return shelfAsText.toString();
    }
}
