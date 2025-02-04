package homework_03_02_25;

import java.util.Comparator;

public class PointComparator implements Comparator<Points> {
    @Override
    public int compare(Points a, Points b) {
        int compared = Double.compare(a.getX(), b.getX());
        if (compared != 0) return compared;
        compared = Double.compare(a.getY(), b.getY());
        if (compared != 0) return compared;
        compared = Double.compare(a.getZ(), b.getZ());
        if (compared != 0) return compared;
        compared = a.getColor().compareTo(b.getColor());
        return compared;
    }
}
