package oop2.example05;

public class Main {
    public static void main(String[] args) {
        InvoiceItem invoiceItem=new InvoiceItem("A101","Pen Red",888,0.088);
        System.out.println(invoiceItem);
        invoiceItem.setQty(999);
        invoiceItem.setUnitPrice(0.99);
        System.out.println(invoiceItem);
        System.out.println(invoiceItem.getId());
        System.out.println(invoiceItem.getDesc());
        System.out.println(invoiceItem.getQty());
        System.out.println(invoiceItem.getUnitPrice());
        System.out.println(invoiceItem.getTotal());
    }
}
