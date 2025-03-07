package example09;

class Ball {
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    Ball(float x,float y, int radius,float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=y;
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

    void  setRadius(int radius){
        this.radius=radius;
    }

    float getxDelta(){
        return xDelta;
    }

    void setxDelta(float xDelta){
        this.xDelta=xDelta;
    }

    float getyDelta(){
        return  yDelta;
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


    public String toString() {
        return x+","+y+"  "+xDelta+","+yDelta;
    }
}
