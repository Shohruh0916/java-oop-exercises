package oop3.example08;

public class Test {
    public static void main(String[] args) {
                MyPoint p1 = new MyPoint(3, 4);
                MyCircle circle1 = new MyCircle(p1, 5);
                System.out.println("Circle 1: " + circle1);
                System.out.println("Area of Circle 1: " + circle1.getArea());
                System.out.println("Circumference of Circle 1: " + circle1.getCircumference());
                MyPoint p2 = new MyPoint(6, 8);
                MyCircle circle2 = new MyCircle(p2, 3);
                System.out.println("Circle 2: " + circle2);
                System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
    }
}
