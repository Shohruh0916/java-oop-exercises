package oop5.example06;

public class Animal {
    private String name;
    Animal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
