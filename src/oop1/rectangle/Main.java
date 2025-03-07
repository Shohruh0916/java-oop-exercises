package oop1.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(4,40);
        Rectangle rectangle1=new Rectangle(3.5,35.9);
        System.out.println("oop1.rectangle.getPerimeter:"+rectangle.getPerimeter());
        System.out.println("oop1.rectangle.getArea:"+rectangle.getArea());
        System.out.println("rectangle1.getArea:"+rectangle1.getArea());
        System.out.println("rectangle1.getPerimeter:"+rectangle1.getPerimeter());

    }
}
