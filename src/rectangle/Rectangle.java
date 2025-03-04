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

    void getPerimeter() {
        System.out.println(2*(width+height));
    }

    void getArea() {
        System.out.println(width*height);
    }
}