package oop5.example01;

public class Cylinder extends Circle {
    private double height;

    Cylinder(){
        super();
        height=1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return  getArea()*height;
    }
}
