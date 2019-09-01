//You are given a date. You just need to write the method, which returns the day on that date.

import java.time.LocalDate;

public class findDay {
    public static void mainNotMain(String[] args) {
        int day = 1;
        int month = 5;
        int year = 1980;

        FindDay(month, day, year);
    }

    private static String FindDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
