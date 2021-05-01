package main.java.my.kata.is_this_a_triangle;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        return a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b;
    }
}
