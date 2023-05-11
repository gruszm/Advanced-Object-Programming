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
        return decoratedBook.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        decoratedBook.setAuthor(author);
    }

    @Override
    public String getTitle() {
        return decoratedBook.getTitle();
    }

    @Override
    public void setTitle(String title) {
        decoratedBook.setTitle(title);
    }

    @Override
    public int getPages() {
        return decoratedBook.getPages();
    }

    @Override
    public void setPages(int pages) {
        decoratedBook.setPages(pages);
    }
}
