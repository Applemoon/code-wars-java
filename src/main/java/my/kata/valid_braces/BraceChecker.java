package main.java.my.kata.valid_braces;

import java.util.ArrayList;
import java.util.List;

public class BraceChecker {
    public boolean isValid(String s) {
        List<Character> open = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isOpening(current)) {
                open.add(current);
            } else {
                if (open.isEmpty()) return false;
                if (isPair(open.get(open.size() - 1), current)) {
                    open.remove(open.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return open.isEmpty();
    }

    private boolean isOpening(Character c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isPair(Character a, Character b) {
        return (a == '(' && b == ')')
                || (a == '{' && b == '}')
                || (a == '[' && b == ']');
    }
}
