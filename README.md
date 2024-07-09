# Online-Book-Store

This Java project is a book management system for a bookstore. 
It allows users to list books, add new books, and buy books with discounts for members. 
It uses Java concepts like classes, exceptions, and user input.

## Java Topics Used:-
- Classes and Objects: Creating and using classes like Book and BookStore.
- Collections Framework: Using List to manage books.
- Conditionals and Loops: Managing user choices with if statements and while loops.
- Custom Exceptions: Handling specific errors like insufficient stock.
- Exception Handling: Using try-catch blocks for error management.
- Encapsulation - Hides data (like title, price) inside classes and uses methods to access or change it.
- Inheritance - MemberDiscount uses Discount interface to apply discount methods.
- Polymorphism - MemberDiscount provides its own way to calculate the discount.
- Abstraction - Discount interface defines discount rules without detailing how they work.
- User Input: Using Scanner to get user input.


## Book Class
- Represents a book with details like title, author, price, and stock.
### Methods:
- Constructor: Sets up the book’s details.
- Getters and Setters: Get or change the book’s details.
- sellBook(int quantity): Reduces stock and throws an error if there is not enough stock.

## Discount Interface
- Provides a method for applying discounts to book prices.
### Methods:
- applyDiscount(double price): Applies a discount and returns the new price. 

## MemberDiscount Class
- Provides a 10% discount for members.
### Methods:
- applyDiscount(double price): Reduces the price by 10%.

## BookStore Class
- Manages books and handles purchases.
### Methods:
- addBook(Book book): Adds a book to the inventory.
- listBooks(): Shows all books and their details.
- purchaseBook(String title, int quantity, boolean isMember): Handles book purchases and applies discounts for members.

## InsufficientStockException Class
- Custom error for when there is not enough stock.
### Methods:
- Constructor: Creates an error message for insufficient stock.

## Main Class
- Runs the application and provides a menu for users.
- Shows options for listing books, adding books, buying books, and exiting.
- Handles user input for different actions.

