package oop4.example01;



public class MyComplex {
    double real=0.0;
    double imag=0.0;

    MyComplex(){

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    double getReal(){
        return  real;
    }

    void setReal(double real){
        this.real=real;
    }

    double getImag(){
        return  imag;
    }

    void setImag(double imag){
        this.imag=imag;
    }

    void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString() {
        return real+"+"+imag+"i";
    }

    boolean isReal(){
        return imag==0;
    }

    boolean isImaginary(){
        return real==0;
    }

    double magnitude(){
        return Math.sqrt(real*real+imag*imag);
    }

    boolean equals(double real, double imag){
        return this.real==real && this.imag==imag;
    }

    boolean eaquals(MyComplex another){
        return this.real==another.real  && this.imag==another.imag;
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real+right.real, this.imag+right.imag);
    }
}

