package main.java.my.kata.valid_parentheses;

public class Solution {

    public static boolean validParentheses(String parens) {
        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            char c = parens.charAt(i);
            if (c == '(') counter++;
            else if (c == ')') {
                counter --;
                if (counter < 0) return false;
            }
        }
        return counter == 0;
    }
}