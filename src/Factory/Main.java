package Factory;

import decoration.Book;

public class Main
{
    public static void main(String[] args)
    {
        Wydawnictwo w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz");
        Book k = w.createBook("Dziady", 130);
        System.out.println(k);
    }
}
