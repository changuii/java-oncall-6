package oncall.enums;

public enum OutputMessage {
    INPUT_MONTH_AND_DAY_OF_WEEK_INTRODUCE("비상 근무를 배정할 월과 시작 요일을 입력하세요> "),
    INPUT_WEEKDAY_WORKERS_INTRODUCE("평일 비상 근무 순번대로 사원 닉네임을 입력하세요> ");
    private final String message;

    OutputMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

