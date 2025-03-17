package oop5.example05;

public class Rectangle extends Shape{
    private  double width;
    private  double length;

    Rectangle(){
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getArea(){
        return width*length;
    }

    double getPerimeter(){
        return 2*(length+width);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public String toString(){
        return getColor()+" "+isFilled()+" "+width+length;
    }
}
