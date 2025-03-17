package oop5.example03;

public class Point3D extends Point2D{
    private float z;

    Point3D(){
        z=0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z=z;
    }

    float [] getXYZ(){
        float[] result=new float[3];
        result[0]=getX();
        result[1]=getY();
        result[2]=z;
        return result;
    }
}
