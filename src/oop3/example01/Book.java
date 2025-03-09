package oop3.example01;

public class Book  {
    private String name;
    private Author author;
    double price;
    int qty=0;

    Book(String  name,Author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }

    Book(String name,Author author,double price,int qty){
        this.qty=qty;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public String getName() {
        return name;
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

    public String toString() {
        return name+" "+(author.name+" "+author.email+" "+author.gender)+" "+price+" "+qty;
    }
}
