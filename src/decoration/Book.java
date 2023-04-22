package decoration;

public class Book implements BookInterface {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format("| %s | %s | %d |", this.author, this.title, this.pages);
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getPages() {
        return this.pages;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }
}
