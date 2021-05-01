package main.java.my.kata.directions_reduction;

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        while (true) {
            boolean removed = false;
            for (int i = 0; i < result.size() - 1; i++) {
                if (isPair(result.get(i), result.get(i + 1))) {
                    result.remove(i);
                    result.remove(i);
                    removed = true;
                    break;
                }
            }
            if (!removed) break;
        }
        return result.toArray(new String[0]);
    }

    private static boolean isPair(String a, String b) {
        return (a.equals("NORTH") && b.equals("SOUTH"))
                || (a.equals("SOUTH") && b.equals("NORTH"))
                || (a.equals("EAST") && b.equals("WEST"))
                || (a.equals("WEST") && b.equals("EAST"));
    }
}
