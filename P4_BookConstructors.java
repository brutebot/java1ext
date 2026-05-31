// Practical 4 - Constructor Overloading (Book)
package bookpackage;

public class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "Vedant Kande", 499.99);
        Book b3 = new Book(b2);

        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println("Book 2 Details:");
        b2.display();

        System.out.println("Book 3 Details (Copied from Book 2):");
        b3.display();
    }
}
