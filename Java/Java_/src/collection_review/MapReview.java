package collection_review;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        System.out.println("map = " + map);
        map.put("a", 5);
        System.out.println("map = " + map);

        System.out.println("map.get(\"a\") = " + map.get("a"));

        map.keySet().forEach(key -> System.out.println("key = " + key));
        map.values().forEach(value -> System.out.println("value = " + value));
        map.entrySet().forEach(entry -> System.out.println("entry = " + entry));


    }
}
