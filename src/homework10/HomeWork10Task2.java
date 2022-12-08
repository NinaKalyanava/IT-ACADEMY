package homework10;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeWork10Task2 {

    public static void main(String[] args) {
        String string = "abcd e abcd e aaa bb c";
        System.out.println(getCharsCount(string));
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character el : charArray) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        return map;
    }

}
