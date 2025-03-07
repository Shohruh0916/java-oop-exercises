package oop2.example02;

class Circle {
    double radius;

    Circle(){
        radius =1.0;
    }
    double getRadius(double r){
        radius =r;
        return r;
    }
    void setRadius(double v){
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getCircumference(){
        return 2*radius*Math.PI;
    }


}
