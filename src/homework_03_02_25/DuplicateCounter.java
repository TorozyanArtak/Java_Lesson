package homework_03_02_25;

import java.util.*;

public class DuplicateCounter {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6));

        Map<Integer, Integer> duplicates = countDuplicates(numbers);

        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            System.out.println("Number " + entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }

    public static Map<Integer, Integer> countDuplicates(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }
}
