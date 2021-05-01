package main.java.my.kata.valid_braces;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BraceCheckerTest {

    private final BraceChecker checker = new BraceChecker();

    @Test
    public void test() {
        assertTrue(checker.isValid("()"));
        assertFalse(checker.isValid("[(])"));
        assertTrue(checker.isValid("(){}[]"));
        assertTrue(checker.isValid("([{}])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("[({})](]"));
    }
}