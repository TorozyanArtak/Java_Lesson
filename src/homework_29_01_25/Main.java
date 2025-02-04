package homework_29_01_25;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ComplexManager manager = new ComplexManager();

        Apartment apt1 = new Apartment(3, 85.5, true, 2);
        Apartment apt2 = new Apartment(2, 60.0, false, 1);
        Apartment apt3 = new Apartment(4, 120.0, true, 3);
        Apartment apt4 = new Apartment(1, 45.0, false, 1);


        Building building1 = new Building(5, 10, Arrays.asList(apt1, apt2));
        Building building2 = new Building(3, 5, Arrays.asList(apt3, apt4));


        Complex complex1 = new Complex("Artsakh", Collections.singletonList(building1));
        Complex complex2 = new Complex("Ararat", Collections.singletonList(building2));


        manager.addComplex(complex1, "12 Dro St, Yerevan");
        manager.addComplex(complex2, "10 Aram Manukyan St, Yerevan");

        System.out.println("Address of Artsakh: " + manager.getAddress(complex1));
        System.out.println("Address of Ararat: " + manager.getAddress(complex2));

        try {
            Complex anonymousComplex = new Complex("Anonymous", Collections.emptyList());
            System.out.println(manager.getAddress(anonymousComplex));
        } catch (ComplexNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
