package oop1.quadraticEquation;
class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(){
        this.a=0;
        this.b=0;
        this.c=0;
    }

    QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }

    double getroot(){
        return  -b/(2*a);
    }

    double getRoot1(){
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }

    double getRoot2(){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
}
