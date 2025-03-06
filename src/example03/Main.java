package example03;

public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(1.2f,3.4f);
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1.getlength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
