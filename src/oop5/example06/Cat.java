package oop5.example06;

public class Cat extends  Mammal{

    public Cat(String name) {
        super(name);
    }

    void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
