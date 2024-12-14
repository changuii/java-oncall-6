package oncall.view;

import java.time.DateTimeException;
import java.time.Month;
import oncall.dto.OnCallDto;
import oncall.enums.DayOfWeeks;
import oncall.enums.ErrorMessage;

public class InputParser {
    private static final String ON_CALL_DELIMITER = ",";

    public OnCallDto parseOnCall(final String onCallText) {
        String[] onCallValue = onCallText.split(ON_CALL_DELIMITER);
        return makeOnCallDto(onCallValue);
    }

    private OnCallDto makeOnCallDto(final String[] onCallValue) {
        try {
            return new OnCallDto(
                    parseMonth(parseInt(onCallValue[0])),
                    DayOfWeeks.parseDayOfWeek(onCallValue[1])
            );
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    private Month parseMonth(final int month) {
        try {
            return Month.of(month);
        } catch (final DateTimeException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    private int parseInt(final String text) {
        try {
            return Integer.parseInt(text);
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
