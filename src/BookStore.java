import java.util.ArrayList;
import java.util.List;

public class BookStore {

    String name;
    List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();;
    }

    public void addBook(Book book){
        books.add(book);
    }

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
