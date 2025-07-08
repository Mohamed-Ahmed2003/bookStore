public class Paper_Book implements IBook {
    private String ISBN;
    private String title ;
    private int publishYear;
    private double price ;
    private double shippingSalary ;


// Constructor
    public Paper_Book(String ISBN, String title, int publishYear, double price, double shippingSalary) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        this.shippingSalary = shippingSalary;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShippingSalary() {
        return shippingSalary;
    }

    public void setShippingSalary(double shippingSalary) {
        this.shippingSalary = shippingSalary;
    }
    
}
