package table;

import decoration.Book;
import decoration.BookInterface;
import java.util.Stack;

public class Table {
    private Stack<BookInterface> stack;
    private int M;

    public Table(int M) throws TableException {
        if (M < 1)
            throw new TableException("Wrong size of the table");

        this.M = M;
        stack = new Stack<BookInterface>();
    }

    void putBook(BookInterface book) throws TableException {
        if (stack.size() == M)
            throw new TableException("Table is full");

        stack.push(book);
    }

    BookInterface peek() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.peek();
    }

    BookInterface takeBook() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.pop();
    }

    public Stack<BookInterface> getStack() {
        return stack;
    }

    public int getM() {
        return M;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
