public class Showcase  implements IBook {
    private String ISBN;
    private String title ;
    private int publishYear;
    private double price=0 ;



    // Constructor
    public Showcase(String ISBN, String title, int publishYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishYear = publishYear;
    }

    // Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public double getPrice() {
        return price;
    }


}
