package table;

import decoration.BookInterface;

import java.util.Stack;

/**
 * Klasa Table reprezentuje stół, na którym można umieszczać książki.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class Table
{
    private Stack<BookInterface> stack;
    private int M;

    /**
     * Konstruktor klasy Table.
     *
     * @param M maksymalna liczba książek, które można umieścić na stole
     * @throws TableException jeśli M jest mniejsze od 1
     */
    public Table(int M) throws TableException
    {
        if (M < 1)
        {
            throw new TableException("Wrong size of the table");
        }

        this.M = M;
        stack = new Stack<BookInterface>();
    }

    /**
     * Metoda putBook umieszcza książkę na stosie.
     *
     * @param book książka, która ma być umieszczona na stole
     * @throws TableException jeśli stół jest pełny
     */
    public void putBook(BookInterface book) throws TableException
    {
        if (stack.size() == M)
        {
            throw new TableException("Table is full");
        }

        stack.push(book);
    }

    /**
     * Metoda peek zwraca książkę z wierzchu stosu bez usuwania jej.
     *
     * @return książka z wierzchu stosu
     * @throws TableException jeśli stół jest pusty
     */
    public BookInterface peek() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.peek();
    }

    /**
     * Metoda takeBook zwraca książkę z wierzchu stosu i usuwa ją ze stosu.
     *
     * @return książka z wierzchu stosu
     * @throws TableException jeśli stół jest pusty
     */
    public BookInterface takeBook() throws TableException
    {
        if (stack.size() == 0)
        {
            throw new TableException("Table is empty");
        }

        return stack.pop();
    }

    /**
     * Metoda getStack zwraca stos książek na stole.
     *
     * @return stos książek na stole
     */
    public Stack<BookInterface> getStack()
    {
        return stack;
    }

    /**
     * Metoda getM zwraca maksymalną liczbę książek, które można umieścić na stole.
     *
     * @return maksymalna liczba książek, które można umieścić na stole
     */
    public int getM()
    {
        return M;
    }

    /**
     * Metoda toString służy do reprezentacji stołu jako String.
     *
     * @return String reprezentujący stół
     */
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
