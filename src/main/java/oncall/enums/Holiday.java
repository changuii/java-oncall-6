package oncall.enums;

import java.time.Month;
import java.util.Arrays;

public enum Holiday {
    NEW_YEAR_DAY(Month.JANUARY, 1),
    INDEPENDENCE_MOVEMENT_DAY(Month.MARCH, 1),
    CHILDREN_DAY(Month.MAY, 5),
    MEMORIAL_DAY(Month.JUNE, 6),
    NATIONAL_LIBERATION_DAY(Month.AUGUST, 15),
    NATIONAL_FOUNDATION_DAY_OF_KOREA(Month.OCTOBER, 3),
    HANGUL_PROCLAMATION_DAY(Month.OCTOBER, 9),
    CHRISTMAS(Month.DECEMBER, 25);

    private Month month;
    private int day;

    Holiday(final Month month, final int day) {
        this.month = month;
        this.day = day;
    }

    public static boolean isHoliday(final Month month, final int day) {
        return Arrays.stream(values())
                .anyMatch(holiday -> holiday.month == month && holiday.day == day);
    }
}
