package Factory;

import decoration.Book;

public class WydawnictwoPoematow extends Wydawnictwo {
    public WydawnictwoPoematow(String author) {
        super(author);
    }

    @Override
    public Book createBook(String title, int pages) {
        return new Poemat(this.author, title, pages);
    }
}
