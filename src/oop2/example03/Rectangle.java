package oop2.example03;

class Rectangle {
    float length;
    float width;

    Rectangle(){
        length=1.0f;
        width=1.0f;
    }

    Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    float getlength(){
        return length;
    }

    void setLength(float length){
      this.length=length;

    }
    float getWidth(){
        return width;
    }

    void setWidth(float width){
        this.width=width;
    }

    double getArea(){
        return length*width;
    }

    double getPerimeter(){
        return  2*(length+width);
    }

}

