package main.java.my.kata.human_readable_duration_format;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TimeFormatterTest {
    @Test
    public void exampleTests() {
        assertEquals("now", TimeFormatter.formatDuration(0));
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("1 day, 1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(86400+3662));
        assertEquals("1 year, 1 day, 1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(31536000+86400+3662));
    }

}