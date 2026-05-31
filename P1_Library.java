// Practical 1 - Library Book Management
package com.library;

class Book {
    String title;
    String author;
    double price;

    void acceptDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author Name : " + author);
        System.out.println("Book Price : " + price);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.acceptDetails("Java Programming", "Vedant Kande", 450.50);
        b1.displayDetails();
    }
}
