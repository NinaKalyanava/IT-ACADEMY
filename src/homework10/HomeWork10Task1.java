package homework10;

import java.util.HashMap;
import java.util.Map;

public class HomeWork10Task1 {

    public static void main(String[] args) {
        Integer[] array1 = {2, 4, 6, 8, 2, 6, 2, 2, 2, 9, 2, 6, 6, 4};
        Map<Integer, Integer> map = arrayToMap(array1);
        System.out.println("Map1: " + map);

        String[] array2 = {"hello", "good", "super", "hello", "super", "good", "111", "good", "super", "hello"};
        Map<String, Integer> map2 = arrayToMap(array2);
        System.out.println("Map2: " + map2);
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K el : ks) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        return map;
    }

}
