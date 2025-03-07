package oop1.regularPolygon;

public class Main {
    public static void main(String[] args) {
        RegularPolygan regularPolygan1=new RegularPolygan();
        RegularPolygan regularPolygan2=new RegularPolygan(6,4);
        RegularPolygan regularPolygan3=new RegularPolygan(10,4,5.6,7.8);
        System.out.println(regularPolygan1.getPerimeter());
        System.out.println(regularPolygan1.getArea());
        System.out.println(regularPolygan2.getPerimeter());
        System.out.println(regularPolygan2.getArea());
        System.out.println(regularPolygan3.getPerimeter());
        System.out.println(regularPolygan3.getArea());
    }
}
