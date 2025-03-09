package oop3.example04;

public class Customer {
    private String name;
    int id;
    private int discount;

    Customer(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", discount=" + discount +
                '}';
    }

}
