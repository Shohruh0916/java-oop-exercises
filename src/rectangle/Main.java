package rectangle;

public class Main {

    static  double getArea(double width,double height){
        return width*height;
    }
    static  double getPerimeter(double width,double height){
        return 2*(width+height);
    }
    public static void main(String[] args) {
        Rectangle a=new Rectangle(4,40);
        Rectangle b=new Rectangle(3.5,35.9);
        System.out.println("Perimeter:"+getPerimeter(a.width, a.height));
        System.out.println("Area:"+getArea(a.width,a.height));
        System.out.println("Perimeter:"+getPerimeter(b.width,b.height));
        System.out.println("Area:"+getArea(b.width,b.height));
    }
}
