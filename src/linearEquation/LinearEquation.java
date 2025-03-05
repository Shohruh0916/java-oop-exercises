package linearEquation;

class LinearEquation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    LinearEquation(){
        this.a=0;
        this.b=0;
        this.c=0;
        this.d=0;
        this.e=0;
        this.f=0;
    }
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    boolean isSolvable(){
        return a*d-b*c!=0;
    }
    double getX() {
        if (!isSolvable()) return Double.NaN;
        return (e*d-b*f)/(a*d-b*c);
    }
    double getY() {
        if (!isSolvable()) return  Double.NaN;
        return (a*f-e*c)/(a*d-b*c);
    }
}
