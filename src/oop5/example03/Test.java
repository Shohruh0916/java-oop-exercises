package oop5.example03;

public class Test {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 4.5f);
        System.out.println(p2d);
        p2d.setX(5.0f);
        p2d.setY(6.0f);
        System.out.println("Updated Point2D: " + p2d);
        float[] xy = p2d.getXY();
        System.out.println("X: " + xy[0] + ", Y: " + xy[1]);

        Point3D p3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3d);
        p3d.setX(7.0f);
        p3d.setY(8.0f);
        p3d.setZ(9.0f);
        System.out.println("Updated Point3D: " + p3d);
        float[] xyz = p3d.getXYZ();
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
    }
}
