import java.util.ArrayList;
import java.util.List;

/**
 * Class to manage books and handles purchases
 */
public class BookStore {

    String name;
    List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();;
    }

    // Adds a book to the inventory
    public void addBook(Book book){
        books.add(book);
    }

    // Shows all books and their details
    public void listBooks(){
        System.out.println("List of all books : ");
        for(Book book : books){
            System.out.println("Book name : " + book.getTitle());
            System.out.println(" Author name : " + book.getAuthor());
            System.out.println("Price : $" + book.getPrice());
            System.out.println("Quantity available : " + book.getStock());
            System.out.println();
        }
    }

    // Handles book purchases and applies discounts for members
    public void purchaseBook(String title, int quantity, boolean isMember) {
        Book purchasedBook = null;
        MemberDiscount memberDiscount = new MemberDiscount();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                purchasedBook = book;
                break;
            }
        }

        if (purchasedBook == null) {
            System.out.println("Book not found: " + title);
            return;
        }
        // try-catch block for handling the InsufficientStockException exception
        try {
            double price = purchasedBook.getPrice();
            if (isMember) {
                MemberDiscount discount = new MemberDiscount();
                price = discount.applyDiscount(price);
            }
            purchasedBook.sellBook(quantity);
            System.out.println(quantity + " copies of " + title + " purchased for : $" + (price * quantity));
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
    }
}
