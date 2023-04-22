package decoration;

/**
 * Main class of this program
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 * @see <a href="https://pl.wikibooks.org/wiki/Kody_%C5%BAr%C3%B3d%C5%82owe/Dekorator_(wzorzec_projektowy)">Decorator</a>
 */
public class Main {
    /**
     * Main method
     * @param args parameters of this program, unused
     */
    public static void main(String[] args) {
        Book b = new Book("Adam Mickiewicz", "Pan Tadeusz", 830);
        System.out.println("Book: " + b);

        NormalCoverBook bookDecorated = new NormalCoverBook(b);
        System.out.println("Book with a cover: " + bookDecorated + '\n');

        b.setPages(1200);
        System.out.println("Book: " + b);
        System.out.println("Book with a cover: " + bookDecorated + '\n');

        bookDecorated.setAuthor("A.M.");
        System.out.println("Book: " + b);
        System.out.println("Book with a cover: " + bookDecorated + '\n');

        SolidCoverBook bookDecorated2 = new SolidCoverBook(b);
        System.out.println("Book: " + b);
        System.out.println("Book with a solid cover: " + bookDecorated2 + '\n');

        DecorativeCoverBook bookDecorated3 = new DecorativeCoverBook(b);
        System.out.println("Book: " + b);
        System.out.println("Book with a decorative cover: " + bookDecorated3 + '\n');
    }
}