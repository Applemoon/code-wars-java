package main.java.my.kata.scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        for (String c : str1.split("")) {
            str2 = str2.contains(c) ? str2.replaceFirst(c, "") : str2;
        }
        return str2.isEmpty();
    }
}
