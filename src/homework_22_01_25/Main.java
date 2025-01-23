package homework_22_01_25;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Country> countries = new LinkedList<>();
        countries.add(new Country("Armenia","Mer Hayreniq","Lion & eagle", "Tricolour", 3000000, 70000));
        countries.add(new Country("Artsakh","Mer Hayreniq2","Lion & eagle", "Tricolour2", 150000, 15000));
        countries.addFirst(new Country("Russia","Velikaya Rasha","Lion", "Tricolour3", 145000000, 17600000));
        countries.addLast(new Country("Ukraine","Velikaya Rasha","Lion", "Tricolour3", 25000000, 0));
        countries.addFirst(new Country("Serbia","Nasha Serbia","Lion2", "Tricolour4", 8000000, 120000));
        countries.addLast(new Country("Kosovo","Nasha Serbia","Lion2", "Tricolour4", 1000000, 0));
        countries.addFirst(new Country("Iran","Allah","Mah turqerin", "Tricolour5", 91000000, 1720000));
        countries.addLast(new Country("Azerbaijan","Allah","Mah turqerin", "Tricolour5", 6000000, 0));

        System.out.println(countries);
        System.out.println("-------------------");
        for (int i = 0; i < countries.size() - 1 ; i++) {
            for (int j = i + 1 ; j < countries.size(); j++) {
                if(countries.get(i).equals(countries.get(j))) {
                    countries.remove(j);
                    j--;
                }
            }
        }

        System.out.println(countries);

    }
}
