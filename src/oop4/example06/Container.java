package oop4.example06;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Container(int x,int y,int width,int height){
        this.x1=x;
        this.y1=y;
        this.x2=x+width-1;
        this.y2=y+height-1;
    }

    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    public boolean collidesWith(Ball ball) {
        boolean collision=false;
        if (ball.getX()-ball.getRadius()<=x1 || ball.getX()+ball.getRadius()>=x2) {
            ball.reflectHorizontal();
            collision=true;
        }
        if (ball.getY()-ball.getRadius()<=y1||ball.getY()+ball.getRadius()>=y2) {
            ball.reflectVertical();
            collision=true;
        }
        return collision;
    }
}
