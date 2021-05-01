package main.java.my.kata.find_the_odd_int;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : a) {
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }

        for (int key: map.keySet()) {
            if (map.get(key) % 2 != 0) return key;
        }
        return 0;
    }
}
