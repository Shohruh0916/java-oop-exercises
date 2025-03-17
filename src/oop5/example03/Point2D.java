package oop5.example03;

public class Point2D {
    private float x;
    private float y;

    Point2D(){
        x=0.0f;
        y=0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    float [] getXY(){
        float [] result=new float[2];
        result[0]=x;
        result[1]=y;
        return result;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
