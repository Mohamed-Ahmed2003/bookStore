import java.time.Year;
import java.util.HashMap;


public class Inventory {
    private static HashMap<IBook, Integer> inventory = new HashMap<>(); 

    public void  add(IBook newBook, Integer q){
        if(inventory.containsKey(newBook)){
            inventory.put(newBook,inventory.get(newBook)+q);
        }
        else
            inventory.put(newBook,q);
    }
    
    //removing book after 10 years
    public void remove(){
        int currentYear= Year.now().getValue();
        for(IBook book : inventory.keySet()){
            if((currentYear-book.getPublishYear())<10){
                inventory.remove(book);
            }
        }
    }

    public void shipping(IBook book){
        System.out.println("book is shipped");
    }

    public void mailServer(IBook book , String email){
        System.out.println("the book send to "+ email);
    }


    public void buy(String ISBN , Integer q , String email){
        for (IBook book :inventory.keySet()){
            if(book.getISBN().toLowerCase()== ISBN.toLowerCase() ){
                if(inventory.get(book)>=q){
                if(book.getClass().getSimpleName()=="Paper_Book"){
                    System.out.println("price of book is equal  "+(q*book.getPrice()));
                    shipping(book);
                }
                else if(book.getClass().getSimpleName()=="Ebook"){
                    System.out.println("price of book is equal  "+q*book.getPrice());

                    mailServer(book, email);
                } 
                inventory.put(book, inventory.get(book)-q);
                }else
                System.out.println("book is out of stock");
            }
        }
    }
    
}
