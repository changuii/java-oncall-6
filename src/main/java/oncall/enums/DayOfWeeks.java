package oncall.enums;

import java.time.DayOfWeek;
import java.util.Arrays;

public enum DayOfWeeks {
    MONDAY(DayOfWeek.MONDAY, "월"),
    TUESDAY(DayOfWeek.TUESDAY, "화"),
    WEDNESDAY(DayOfWeek.WEDNESDAY, "수"),
    THURSDAY(DayOfWeek.TUESDAY, "목"),
    FRIDAY(DayOfWeek.FRIDAY, "금"),
    SATURDAY(DayOfWeek.SATURDAY, "토"),
    SUNDAY(DayOfWeek.SUNDAY, "일");

    private DayOfWeek dayOfWeek;
    private String koreanDayOfWeek;

    DayOfWeeks(final DayOfWeek dayOfWeek, final String koreanDayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.koreanDayOfWeek = koreanDayOfWeek;
    }

    public static DayOfWeek parseDayOfWeek(final String koreanDayOfWeek) {
        return Arrays.stream(values())
                .filter(dayOfWeeks -> dayOfWeeks.koreanDayOfWeek.equals(koreanDayOfWeek))
                .map(dayOfWeeks -> dayOfWeeks.dayOfWeek)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage()));
    }
}
