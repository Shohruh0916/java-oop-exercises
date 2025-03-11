package oop4.example02;

public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(4, 5);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("p1 evaluated at x=2: " + p1.evaluate(2));
        MyPolynomial sum = p1.add(p2);
        System.out.println("p1 + p2: " + sum);
        MyPolynomial product = p1.multiply(p2);
    }
}
