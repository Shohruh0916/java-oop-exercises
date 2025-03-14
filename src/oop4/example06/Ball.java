package oop4.example06;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    Ball(float x,float y, int radius , int speed,int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        double radians=Math.toRadians(direction);
        this.xDelta=(float) (speed*Math.cos(radians));
        this.yDelta=(float) (speed*Math.sin(radians));
    }

    float getX(){
        return x;
    }

    void setX(float x){
        this.x=x;
    }

    float getY(){
        return  y;
    }

    void setY(float y){
        this.y=y;
    }

    int getRadius(){
        return  radius;
    }

    void setRadius(int radius){
        this.radius=radius;
    }

    float getxDelta(){
        return xDelta;
    }

    void setxDelta(float xDelta){
        this.xDelta=xDelta;
    }

    float getyDelta(){
        return yDelta;
    }

    void setyDelta(float yDelta){
        this.yDelta=yDelta;
    }

    void move(){
        x+=xDelta;
        y+=yDelta;
    }

    void reflectHorizontal(){
        xDelta=-xDelta;
    }

    void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
