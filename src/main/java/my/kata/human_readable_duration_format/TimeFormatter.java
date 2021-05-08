package main.java.my.kata.human_readable_duration_format;


import java.util.ArrayList;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        int years = seconds / (60 * 60 * 24 * 365);
        int days = seconds % (60 * 60 * 24 * 365) / (60 * 60 * 24);
        int hours = seconds % (60 * 60 * 24) / (60 * 60);
        int minutes = seconds % (60 * 60) / 60;
        int secs = seconds % 60;

        ArrayList<String> units = new ArrayList<>();
        if (years != 0) {
            units.add(years + (years == 1 ? " year" : " years"));
        }
        if (days != 0) {
            units.add(days + (days == 1 ? " day" : " days"));
        }
        if (hours != 0) {
            units.add(hours + (hours == 1 ? " hour" : " hours"));
        }
        if (minutes != 0) {
            units.add(minutes + (minutes == 1 ? " minute" : " minutes"));
        }
        if (secs != 0) {
            units.add(secs + (secs == 1 ? " second" : " seconds"));
        }

        return String.join(", ", units.subList(0, units.size() - 1))
                + ((units.size() > 1) ? " and " : "")
                + units.get(units.size() - 1);
    }
}
