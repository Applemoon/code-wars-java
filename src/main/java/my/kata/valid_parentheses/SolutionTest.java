package main.java.my.kata.valid_parentheses;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void sampleTest() {
        assertTrue(Solution.validParentheses("()"));
        assertFalse(Solution.validParentheses("())"));
        assertTrue(Solution.validParentheses("32423(sgsdg)"));
        assertFalse(Solution.validParentheses("(dsgdsg))2432"));
        assertTrue(Solution.validParentheses("adasdasfa"));
        assertTrue(Solution.validParentheses("()"));
        assertFalse(Solution.validParentheses(")(()))"));
        assertFalse(Solution.validParentheses("("));
        assertTrue(Solution.validParentheses("(())((()())())"));
    }
}
