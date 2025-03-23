package oop6.example03;

public class MyInteger {
    int value;

    MyInteger(int value){
        this.value=value;
    }

    int getValue(){
        return value;
    }

    boolean isEven(){
        return value%2==0;
    }

    boolean isOdd(){
        return value%2!=0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num<=1) return false;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger num) {
        return num.isEven();
    }

    public static boolean isOdd(MyInteger num) {
        return num.isOdd();
    }

    public static boolean isPrime(MyInteger num) {
        return num.isPrime();
    }

    boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int num) {
        return this.value == num;
    }

    public boolean equals(MyInteger num) {
        return this.value == num.value;
    }

    public static int parseInt(char[] charArray) {
        return Integer.parseInt(new String(charArray));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
