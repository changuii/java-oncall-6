package oncall.view;

import java.util.regex.Pattern;
import oncall.enums.ErrorMessage;

public class InputValidator {
    private static final String ON_CALL_REGEX = "^[1-9]+,[가-힣]$";
    private static final Pattern ON_CALL_PATTERN = Pattern.compile(ON_CALL_REGEX);

    public void validateOnCall(final String onCallText) {
        if (!ON_CALL_PATTERN.matcher(onCallText).matches()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
