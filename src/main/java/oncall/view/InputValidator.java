package oncall.view;

import java.util.List;
import java.util.regex.Pattern;
import oncall.enums.ErrorMessage;

public class InputValidator {
    private static final String ON_CALL_REGEX = "^[1-9]+,[가-힣]$";
    private static final Pattern ON_CALL_PATTERN = Pattern.compile(ON_CALL_REGEX);
    private static final String WORKERS_REGEX = "";
    private static final Pattern WORKERS_PATTERN = Pattern.compile(WORKERS_REGEX);
    private static final int WORKERS_NAME_LENGTH_MIN = 1;
    private static final int WORKERS_NAME_LENGTH_MAX = 5;
    private static final int WORKERS_COUNT_MIN = 5;
    private static final int WORKERS_COUNT_MAX = 35;

    public void validateOnCall(final String onCallText) {
        if (!ON_CALL_PATTERN.matcher(onCallText).matches()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    public void validateWorkers(final String workersText) {
        if (!WORKERS_PATTERN.matcher(workersText).matches()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    public void validateWorkers(final List<String> workers) {
        validateWorkersDuplication(workers);
        validateWorkersCountRange(workers);
        workers.forEach(this::validateWorkerNameLengthRange);
    }

    private void validateWorkersDuplication(final List<String> workers) {
        if (workers.stream().distinct().count() != workers.size()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    private void validateWorkersCountRange(final List<String> workers) {
        if (workers.size() < WORKERS_COUNT_MIN || WORKERS_COUNT_MAX < workers.size()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    private void validateWorkerNameLengthRange(final String workerName) {
        if (workerName.length() < WORKERS_NAME_LENGTH_MIN || WORKERS_NAME_LENGTH_MAX < workerName.length()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
