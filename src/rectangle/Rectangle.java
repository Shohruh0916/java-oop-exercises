package rectangle;
class Rectangle {
    double width;
    double height;

    Rectangle(){
        width=1;
        height=1;
    }

    Rectangle(double width, double height){
        this.height=height;
        this.width=width;
    }

    double getPerimeter() {
        return 2*(width+height);
    }

    double getArea() {
        return width*height;
    }
}