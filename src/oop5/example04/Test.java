package oop5.example04;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(3.0f, 4.0f);
        System.out.println("Initial Point: " + p1);
        p1.setX(5.0f);
        p1.setY(6.0f);
        System.out.println("Updated Point: " + p1);
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Initial MovablePoint: " + mp1);
        mp1.move();
        System.out.println("After move(): " + mp1);
        mp1.setSpeed(2.0f, 2.5f);
        System.out.println("Updated speed: " + mp1);
        mp1.move();
        System.out.println("After second move(): " + mp1);
    }
}
