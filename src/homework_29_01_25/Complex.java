package homework_29_01_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Complex {
    private final String name;
    private final List<Building> buildings;

    public Complex(String name, List<Building> buildings) {
        this.name = name;
        this.buildings = new ArrayList<>(buildings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Objects.equals(name, complex.name) && Objects.equals(buildings, complex.buildings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, buildings);
    }
}
