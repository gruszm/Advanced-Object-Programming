package table;

import decoration.Book;

public class Main {
    public static void main(String[] args)
    {
        try {
            Table table = new Table(-1);
            table.putBook(new Book("Mickiewicz", "Pan Tadeusz", 1000));
            System.out.println(table);
            System.out.println(table.takeBook());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
