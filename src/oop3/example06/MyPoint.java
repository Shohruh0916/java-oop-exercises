package oop3.example06;

public class MyPoint {
    private  int x=0;
    private  int y=0;

    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    int getX(){
        return x;
    }

    void setX(int x){
        this.x=x;
    }

    int getY(){
        return y;
    }

    void setY(int y){
        this.y=y;
    }

    int [] getXY(){
        return new int[]{x, y};
    }

    void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double distance(int x, int y){
         int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }
}
