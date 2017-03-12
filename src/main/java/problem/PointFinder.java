package pointsLines;

import java.util.*;

public class PointFinder {
    private final List<Line> lines = new ArrayList<>();
    private final List<Point> points = new ArrayList<>();

    PointFinder point(double x, double y) {
        points.add(new Point(x,y));
        return this;
    }
    PointFinder line(double k, double c) {
        lines.add(new Line(k, c));
        return this;
    }
    PointsPair find() {
        PointsPair bestPair = null;
        int maxFrequency = 0;
        for (int i = 0; i < points.size(); i ++) {
            for (int j = 0; j < i; j ++) {
                Point a = points.get(i);
                Point b = points.get(j);
                double pointsK = (b.getY()-a.getY())/(b.getX()-a.getX());
                int frequency = 0;
                for (Line line : lines) {
                    if (pointsK == line.getK()) {
                        frequency = frequency + 1;
                    }
                }
                if (frequency > maxFrequency) {
                    maxFrequency =frequency;
                    bestPair = new PointsPair(a, b);
                }
            }
        }
        return bestPair;
    }
}
