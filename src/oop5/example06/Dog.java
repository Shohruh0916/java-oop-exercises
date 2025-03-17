package oop5.example06;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    void greets(){
        System.out.println("Woof");
    }

    void greets(Dog another){
        System.out.println("Woof");
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }

}
