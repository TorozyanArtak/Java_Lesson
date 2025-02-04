package homework_29_01_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {
    private final int floors;
    private final int parkingSpaces;
    private final List<Apartment> apartments;

    public Building(int floors, int parkingSpaces, List<Apartment> apartments) {
        this.floors = floors;
        this.parkingSpaces = parkingSpaces;
        this.apartments = new ArrayList<>(apartments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return floors == building.floors &&
                parkingSpaces == building.parkingSpaces &&
                Objects.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, parkingSpaces, apartments);
    }
}
