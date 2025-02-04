package homework_03_02_25;

import java.util.Objects;

public class Points {

    private final double x;
    private final double y;

    private final double z;
    private final String color;
    private final String pointName;

    public Points(double x, double y, double z, String color, String pointName) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        this.pointName = pointName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points = (Points) o;
        return Double.compare(x, points.x) == 0 && Double.compare(y, points.y) == 0 && Double.compare(z, points.z) == 0 && Objects.equals(color, points.color) && Objects.equals(pointName, points.pointName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, color, pointName);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color='" + color + '\'' +
                ", pointName='" + pointName + "}";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return pointName;
    }
}
