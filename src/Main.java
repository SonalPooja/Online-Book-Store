import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // creating book store
        BookStore bookStore = new BookStore("The Java Book Store");

        // adding sample books to the book store
        bookStore.addBook(new Book("Effective Java", "Joshua Bloch", 45.00, 10));
        bookStore.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, 5));

        // menu
        while (true) {
            System.out.println("****************************");
            System.out.println("1. List all books");
            System.out.println("2. Add new book");
            System.out.println("3. Purchase book");
            System.out.println("4. Exit");
            System.out.println("****************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    // printing all books details
                    bookStore.listBooks();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int stock = scanner.nextInt();
                    // adding book to the book store
                    bookStore.addBook(new Book(title, author, price, stock));
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Are you a member of this book store? (true/false): ");
                    boolean isMember = scanner.nextBoolean();
                    // purchasing book
                    bookStore.purchaseBook(bookTitle, quantity, isMember);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Enter a valid option.");
            }
        }
    }
}
