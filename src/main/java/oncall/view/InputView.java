package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import oncall.dto.OnCallDto;

public class InputView {
    private final InputValidator inputValidator;
    private final InputParser inputParser;

    public InputView(final InputValidator inputValidator, final InputParser inputParser) {
        this.inputValidator = inputValidator;
        this.inputParser = inputParser;
    }

    public OnCallDto readMonthAndStartDayOfWeek() {
        String input = Console.readLine();
        inputValidator.validateOnCall(input);
        return inputParser.parseOnCall(input);
    }

    public List<String> readWorkers() {
        String input = Console.readLine();
        inputValidator.validateWorkers(input);
        List<String> workers = inputParser.parseWorkers(input);
        inputValidator.validateWorkers(workers);
        return workers;
    }
}
