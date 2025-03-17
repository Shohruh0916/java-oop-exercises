package oop5.example05;

public class Circle extends Shape{
    private double radius;

    Circle(){
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return getColor()+" "+isFilled()+" "+radius;
    }
}
