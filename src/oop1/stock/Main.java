package oop1.stock;

public class Main {
    public static void main(String[] args) {
        Stock stock=new Stock(34.35,34.5,"Corporation","ORCL");
        System.out.println("oop1.stock.getChangePrecent:"+stock.getChangePrecent());
    }
}
