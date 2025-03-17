package oop5.example04;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint(){
        xSpeed=0.0f;
        ySpeed=0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    float [] getSpeed(){
        float[] result=new float[2];
        result[0]=xSpeed;
        result[1]=ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return getX()+" "+getY()+xSpeed+ySpeed;
    }


    MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
