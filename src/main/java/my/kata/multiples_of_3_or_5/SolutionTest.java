package main.java.my.kata.multiples_of_3_or_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
        assertEquals(33, new Solution().solution(11));
        assertEquals(33, new Solution().solution(12));
    }
}
