package Factory;

import decoration.Book;

public class WydawnictwoPowiesciHistorycznych extends Wydawnictwo
{
    public WydawnictwoPowiesciHistorycznych(String author)
    {
        super(author);
    }

    @Override
    public Book createBook(String title, int pages)
    {
        return new PowiescHistoryczna(this.author, title, pages);
    }
}
