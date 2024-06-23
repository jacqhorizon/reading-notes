import java.awt.*;

public class Triangle {
    public Point v1;
    public Point v2;
    public Point v3;
    public Point m1;
    public Point m2;
    public Point m3;
    private Point midpoint(Point p1, Point p2) {
        int x = (int) (p1.getX() + p2.getX())/2;
        int y = (int) (p1.getY() + p2.getY())/2;
        return new Point(x, y);
    }
    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.m1 = midpoint(v1, v2);
        this.m2 = midpoint(v2, v3);
        this.m3 = midpoint(v3, v1);
    }


}
