package oop2.example01;

class Circle {
    double radius;
    String color;

    Circle(){
        radius=1.0;
        color="red";
    }

    Circle(double r){
        radius=r;
        color="red";
    }

    double getRadius(){
        return  radius;
    }

    double getArea(){
        return  radius*radius*Math.PI;
    }
}
