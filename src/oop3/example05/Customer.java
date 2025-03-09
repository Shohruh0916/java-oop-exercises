package oop3.example05;

public class Customer {
    int id;
    String name;
    char gender;

    Customer(int id,String name,char gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'';
    }
}
