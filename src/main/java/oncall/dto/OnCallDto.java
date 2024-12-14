package oncall.dto;

import java.time.DayOfWeek;
import java.time.Month;

public record OnCallDto(Month month, DayOfWeek dayOfWeek) {
}
