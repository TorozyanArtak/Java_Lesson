package homework_19_01_24;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(4.5);
        numbers.add(15.0);
        numbers.add(10.3);
        numbers.add(52.0);
        numbers.add(1258.0);
        numbers.add(125.8);
        numbers.add(236.0);
        numbers.add(-12.8);
        numbers.add(-539.0);

        ArrayList<Number> integers = new ArrayList<>();

        for (Double number : numbers) {
            if (number % 1 == 0) {
                integers.add(number);
            }
        }
        System.out.println(numbers);
        System.out.println(integers);


    }
}
