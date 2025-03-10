package oop3.example07;

public class MyLine {
    private MyPoint begin, end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = new MyPoint(begin.getX(), begin.getY());
        this.end = new MyPoint(end.getX(), end.getY());
    }

    public MyPoint getBegin() {
        return new MyPoint(begin.getX(), begin.getY());
    }

    public void setBegin(MyPoint begin) {
        this.begin = new MyPoint(begin.getX(), begin.getY());
    }

    public MyPoint getEnd() {
        return new MyPoint(end.getX(), end.getY());
    }

    public void setEnd(MyPoint end) {
        this.end = new MyPoint(end.getX(), end.getY());
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Qo‘shimcha metodlar
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return Math.atan2(dy, dx);
    }

    public MyPoint getMidpoint() {
        int midX = (begin.getX() + end.getX()) / 2;
        int midY = (begin.getY() + end.getY()) / 2;
        return new MyPoint(midX, midY);
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyLine other)) return false;
        return begin.equals(other.begin) && end.equals(other.end);
    }

    @Override
    public int hashCode() {
        return 31 * begin.hashCode() + end.hashCode();
    }
}
