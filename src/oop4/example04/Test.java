package oop4.example04;

public class Test {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println("Default time: " + time1);
        MyTime time2 = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time2);
        time2.nextSecond();
        System.out.println("After nextSecond(): " + time2);
        time2.previousSecond();
        System.out.println("After previousSecond(): " + time2);
        MyTime time3 = new MyTime(12, 59, 30);
        time3.nextMinute();
        System.out.println("After nextMinute(): " + time3);
        time3.previousMinute();
        System.out.println("After previousMinute(): " + time3);
        MyTime time4 = new MyTime(22, 15, 45);
        time4.nextHour();
        System.out.println("After nextHour(): " + time4);
        time4.previousHour();
        System.out.println("After previousHour(): " + time4);
        time1.setTime(14, 30, 15);
        System.out.println("After setTime(14,30,15): " + time1);
    }
}
