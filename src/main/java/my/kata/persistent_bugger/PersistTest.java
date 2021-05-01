package main.java.my.kata.persistent_bugger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistTest {

    @Test
    public void BasicTests() {
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
        assertEquals(3, Persist.persistence(199178));
    }
}
