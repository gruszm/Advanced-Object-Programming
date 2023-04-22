package decoration;

public interface BookInterface {
    @Override
    public String toString();
    public String getAuthor();
    public void setAuthor(String author);
    public String getTitle();
    public void setTitle(String title);
    public int getPages();
    public void setPages(int pages);
}
