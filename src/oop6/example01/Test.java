package oop6.example01;

public class Test {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5, 23, 55);

        System.out.println("Current time: " + t1);
        System.out.println("Time from elapsed milliseconds: " + t2);
        System.out.println("Specified time: " + t3);
    }
}
