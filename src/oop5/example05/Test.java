package oop5.example05;

public class Test {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println("Default square: " + square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        Square square2 = new Square(5.0);
        System.out.println("\nSquare with side 5.0: " + square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        Square square3 = new Square(7.5, "blue", true);
        System.out.println("\nSquare with side 7.5, color blue, filled: " + square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());
    }
}
