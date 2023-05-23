package Factory;

import decoration.Book;

public abstract class Wydawnictwo {
    protected String author;

    public static Wydawnictwo getWydawnictwo(String author) {
        if (author.equals("Adam Mickiewicz")) {
            return new WydawnictwoPoematow(author);
        } else if (author.equals("Autor Historyczny")) {
            return new WydawnictwoPowiesciHistorycznych(author);
        } else if (author.equals("Autor Medyczny")) {
            return new WydawnictwoThrillerow(author);
        } else {
            throw new RuntimeException("Nieznany autor: " + author);
        }
    }

    public abstract Book createBook(String title, int pages);

    Wydawnictwo(String author) {
        this.author = author;
    }
}
