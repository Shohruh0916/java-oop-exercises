package oop6.example03;

public class Test {
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(17);
        MyInteger num2 = new MyInteger(10);
        MyInteger num3 = new MyInteger(17);

        System.out.println("17 isEven? " + num1.isEven());
        System.out.println("17 isOdd? " + num1.isOdd());
        System.out.println("17 isPrime? " + num1.isPrime());

        System.out.println("10 isEven? " + num2.isEven());
        System.out.println("10 isOdd? " + num2.isOdd());
        System.out.println("10 isPrime? " + num2.isPrime());

        System.out.println("Static isPrime(MyInteger(17))? " + MyInteger.isPrime(num1));

        System.out.println("num1.equals(17)? " + num1.equals(17));
        System.out.println("num1.equals(num3)? " + num1.equals(num3));

        char[] charArray = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArray));
        System.out.println("parseInt(String): " + MyInteger.parseInt("456"));
    }
}
