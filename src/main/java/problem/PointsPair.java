package pointsLines;

public class PointsPair {
    private Point a;
    private Point b;

    public PointsPair(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{" + a + ", " + b + '}';
    }
}
