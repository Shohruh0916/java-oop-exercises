package oop3.example01;

public class Book extends Author{
    private Author author;
    private double price;
    private int qty;

    public Book(String name,Author author, double price) {
        super(name, author.getEmail(), author.getGender());
        this.author = author;
        this.qty = qty;
        this.price=price;
    }

    public Book(String name, Author author,double price, int qty) {
        super(author.getName(), author.getEmail(), author.getGender());
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[ " +
                "name=" + getName() +
                super.toString();
    }
}