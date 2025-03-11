package oop4.example01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary parts of the first complex number: ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);
        System.out.print("Enter real and imaginary parts of the second complex number: ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);
        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("Is the first number real? " + c1.isReal());
        System.out.println("Is the first number imaginary? " + c1.isImaginary());
        System.out.println("Are the two complex numbers equal? " + c1.equals(c2));
        System.out.println("Magnitude of first complex number: " + c1.magnitude());
        MyComplex sum = c1.addNew(c2);
        System.out.println("Sum of the two complex numbers (new object): " + sum);
        c1.addInto(c2);
        System.out.println("Sum of the two complex numbers (updated first number): " + c1);

    }
}
