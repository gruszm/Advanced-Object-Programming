package table;

import decoration.BookInterface;

import java.util.ArrayList;
import java.util.List;

public class Shelf
{
    private List<BookInterface> booksList;
    private final int maxPages;

    public Shelf(int maxPages)
    {
        this.booksList = new ArrayList<>();
        this.maxPages = maxPages;
    }

    private int sumPages()
    {
        int sum = 0;

        for (BookInterface b : booksList)
        {
            sum += b.getPages();
        }

        return sum;
    }

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
