public class Book {

    private String title;
    private String author;
    private double price;
    private int stock;

    // constructor
    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // getters and setters to access private variables
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * reduce the stock by specified quantity
     * @param quantity
     * @throws InsufficientStockException
     */
    public void sellBook(int quantity) throws InsufficientStockException {
        if(stock < quantity){
            throw new InsufficientStockException("Insufficient stock of book : " + title);
        }
        stock = stock - quantity;
    }
}
