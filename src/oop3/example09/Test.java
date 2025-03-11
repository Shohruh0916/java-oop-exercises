package oop3.example09;

public class Test {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 2, 2, 4, 0);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());
        MyTriangle t2 = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
        MyTriangle t3 = new MyTriangle(1, 1, 3, 5, 6, 2);
        System.out.println(t3);
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.println("Type: " + t3.getType());
    }
}
