package table;

import decoration.BookInterface;

import java.util.Stack;

public class Table
{
    private Stack<BookInterface> stack;
    private int M;

    public Table(int M) throws TableException
    {
        if (M < 1)
        {
            throw new TableException("Wrong size of the table");
        }

        this.M = M;
        stack = new Stack<BookInterface>();
    }

    public void putBook(BookInterface book) throws TableException
    {
        if (stack.size() == M)
        {
            throw new TableException("Table is full");
        }

        stack.push(book);
    }

    public BookInterface peek() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.peek();
    }

    public BookInterface takeBook() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.pop();
    }

    public Stack<BookInterface> getStack()
    {
        return stack;
    }

    public int getM()
    {
        return M;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (BookInterface book : stack) { // Zmienna 'books' powinna być listą lub stosiem książek w Twoim stole.
            sb.append(String.format("| %s | %s | %d |\n", book.getAuthor(), book.getTitle(), book.getPages()));
        }
        return sb.toString();
    }
}
