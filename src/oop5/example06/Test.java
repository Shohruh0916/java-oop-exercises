package oop5.example06;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Buddy");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Max");
        System.out.println(dog2);
        dog1.greets(dog2);
    }
}
