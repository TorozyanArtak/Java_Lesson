package homework_03_02_25;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestPoint {
    public static void main(String[] args) {
        HashMap<Points, String> pointsMap = new HashMap<>();

        pointsMap.put(new Points(1.0, 2.0, 3.0, "Red", "A"), "Hayk");
        pointsMap.put(new Points(1.0, 2.0, 3.0, "Red", "B"), "Aram");
        pointsMap.put(new Points(4.0, 5.0, 6.0, "Blue", "C"), "Areg");
        pointsMap.put(new Points(7.0, 8.0, 9.0, "Green", "D"), "Davit");
        pointsMap.put(new Points(4.0, 5.0, 6.0, "Blue", "C"), "Karen");
        System.out.println(pointsMap);

        Map<Points, String> pointsTreeMap = new TreeMap<>(new PointComparator());
        pointsTreeMap.putAll(pointsMap);
        System.out.println(pointsTreeMap);

        Map<String, Points> invertedMap = invertMap(pointsMap);
        for (Map.Entry<String, Points> entry : invertedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("-----------------------------");

        Map<String, Points> invertedTreeMap = invertMap(pointsTreeMap);
        for (Map.Entry<String, Points> entry : invertedTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }


    public static <K, V> Map<V, K> invertMap(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (invertedMap.containsKey(entry.getValue())) {
                throw new RuntimeException("Duplicate value encountered when inverting: " + entry.getValue());
            }
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }
}