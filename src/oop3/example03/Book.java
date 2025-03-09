package oop3.example03;

class Book extends Author {
    private String isbn;
    private  Author author;
    private  double price;
    private  int qty=0;

    public Book(String isbn,String name,Author author,double price) {
        super(name, author.getEmail());
        this.isbn = isbn;
        this.author = author;
        this.price=price;
    }

    public Book(String isbn,String name,Author author,double price,int qty) {
        super(name, author.getEmail());
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return getName();
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    String  getAuthorName(){
        return author.getName();
    }


    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
