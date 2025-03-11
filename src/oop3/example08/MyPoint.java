package oop3.example08;

public class MyPoint {
    private int x;
    private int y;


    MyPoint(){
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(MyPoint other){
        return  ( Math.sqrt(Math.pow(this.y-other.y, 2))+Math.pow(this.x-other.y,2));
    }
}
