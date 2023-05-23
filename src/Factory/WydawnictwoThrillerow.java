package Factory;

import decoration.Book;

public class WydawnictwoThrillerow extends Wydawnictwo {
    public WydawnictwoThrillerow(String author) {
        super(author);
    }

    @Override
    public Book createBook(String title, int pages) {
        return new ThrillerMedyczny(this.author, title, pages);
    }
}
