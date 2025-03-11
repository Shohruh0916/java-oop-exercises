package oop3.example08;

public class MyCircle {
    private MyPoint center;
    private int radius;


    MyCircle(){
        this.center=new MyPoint(0,0);
        this.radius=1;
    }

    MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }

    MyCircle(int x, int y,int radius){
        this.center=new MyPoint(x,y);
        this.radius=radius;
    }

    int getRadius(){
        return  radius;
    }

    void setRadius(int radius){
        this.radius=radius;
    }

    MyPoint getCenter(){
        return center;
    }

    void setCenter(MyPoint center){
        this.center=center;
    }

    int getCenterX(){
        return center.getX();
    }

    void setCenterX(int x){
        center.setX(x);
    }

    int getCenterY(){
        return center.getY();
    }

    void setCenterY(int y){
        center.setY(y);
    }

    void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    double getCircumference(){
        return Math.PI*2*radius;
    }

    public double distance(MyCircle other){
        return center.distance(other.getCenter());
    }

}
