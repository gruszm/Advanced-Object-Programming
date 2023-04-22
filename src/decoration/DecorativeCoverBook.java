package decoration;

public class DecorativeCoverBook extends BookDecorator {

    public DecorativeCoverBook(BookInterface decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String toString() {
        return "{ [ " + decoratedBook.toString() + " ] }";
    }

    @Override
    public String getAuthor() {
        return getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        setAuthor(author);
    }

    @Override
    public String getTitle() {
        return getAuthor();
    }

    @Override
    public void setTitle(String title) {
        setTitle(title);
    }

    @Override
    public int getPages() {
        return getPages();
    }

    @Override
    public void setPages(int pages) {
        setPages(pages);
    }
}
