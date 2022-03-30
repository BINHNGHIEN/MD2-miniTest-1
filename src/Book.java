public class Book {
    private double bookCode;
    private  String name;
    private  double price;
    private  String author;

    public Book() {
    }

    public Book(double bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBookCode(double bookCode) {
        this.bookCode = bookCode;
    }

    public double getBookCode() {
        return bookCode;
    }
}
