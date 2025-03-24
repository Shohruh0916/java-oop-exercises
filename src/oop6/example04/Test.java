package oop6.example04;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");

        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Distance from p1 to p2: " + p1.distance(p2));

        System.out.println("Distance from p1 to (7,1): " + p1.distance(7, 1));

        MyPoint p3 = new MyPoint(6, 8);
        System.out.println("Distance from p2 to p3 (static method): " + MyPoint.distance(p2, p3));
    }
}
