package oop5.example04;

public class Point {
    private float x;
    private float y;

    Point(){
        x=0.0f;
        y=0.0f;
    }

    Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    float[] getXY(){
        float[] result=new float[2];
        result[0]=x;
        result[1]=y;
        return result;
    }

    public String toString(){
        return x+" "+y;
    }


}
