package Factory;

import decoration.Book;

/**
 * Główna klasa programu pokazująca użycie wzorca Factory.
 *
 * @author Mariusz Gruszczynski
 * @version 1.0
 * @since JDK 17
 */
public class Main
{
    /**
     * Główna metoda programu.
     *
     * @param args argumenty wiersza poleceń (nieużywane)
     */
    public static void main(String[] args)
    {
        Wydawnictwo w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz");
        Book k = w.createBook("Dziady", 130);
        System.out.println(k);
    }
}
