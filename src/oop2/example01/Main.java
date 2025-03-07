package oop2.example01;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1.getRadius()+" and area of:"+c1.getArea());
        Circle c2=new Circle(2);
        System.out.println(c2.getRadius()+" and area of:"+c2.getArea());
    }
}
