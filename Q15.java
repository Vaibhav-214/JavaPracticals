package com.Practical;

public class Q15 {
    public static void main(String[] args) {

    }
}
class Publication {
    private String title;
    private String author;
    private int price;
    Publication(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getPrice() {
        return price;
    }

}

class Book extends Publication {
    int pageCount;

    Book(int pageCount, String author, String title, int price) {
        super(title, author, price);
        this.pageCount = pageCount;
    }
    
}
