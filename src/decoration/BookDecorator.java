package decoration;

public abstract class BookDecorator implements BookInterface {
    protected BookInterface decoratedBook;

    public BookDecorator(BookInterface decoratedBook)
    {
        this.decoratedBook = decoratedBook;
    }
}
