public class Bookstore {
    public static void main (String []arges){
        IBook b1= new Ebook("123", "blah", 2023, 50);
        IBook b2 = new Paper_Book("124", "blah blah", 2020, 40, 15);

        Inventory inventory= new Inventory();
        inventory.add(b1, 5);
        inventory.add(b2, 3);
        inventory.buy("123", 2, "asdf@mail.com");
    }
}
