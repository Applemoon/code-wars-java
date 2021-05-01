package main.java.my.kata.persistent_bugger;

public class Persist {
    public static int persistence(long n) {
        int count = 0;

        while (n > 9) {
            n = multiply(n);
            count++;
        }

        return count;
    }

    private static int multiply(long n) {
        int length = String.valueOf(n).length();
        int result = 1;
        for (int i = 0; i < length; i++) {
            result *= n % 10;
            n /= 10;
        }
        return result;
    }
}
