package dare12;

import java.util.Calendar;

//just follow the solution to deliver the challenge
public class Dare12 {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        int dayweek = calendar.get(Calendar.DAY_OF_WEEK);

        return days[dayweek - 1];
    }
}
