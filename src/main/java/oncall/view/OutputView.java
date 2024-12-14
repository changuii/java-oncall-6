package oncall.view;

import oncall.enums.OutputMessage;

public class OutputView {
    public void printMonthAndDayOfWeekIntroduce() {
        print(OutputMessage.INPUT_MONTH_AND_DAY_OF_WEEK_INTRODUCE);
    }

    public void printWeekDayWorkersIntroduce() {
        print(OutputMessage.INPUT_WEEKDAY_WORKERS_INTRODUCE);
    }

    public void printHolidayWorkersIntroduce() {
        print(OutputMessage.INPUT_HOLIDAY_WORKERS_INTRODUCE);
    }

    public void printLineBreak() {
        System.out.print(System.lineSeparator());
    }

    private void print(final Object message, final Object... values) {
        System.out.print(formatMessage(message.toString(), values));
    }

    private String formatMessage(final Object formatMessage, final Object... values) {
        return String.format(formatMessage.toString(), values);
    }
}
