package main.java.my.kata.multiples_of_3_or_5;

public class Solution {
    public int solution(int number) {
        int result = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
