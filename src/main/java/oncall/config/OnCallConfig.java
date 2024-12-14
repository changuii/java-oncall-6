package oncall.config;

import oncall.controller.OnCallController;
import oncall.view.InputParser;
import oncall.view.InputValidator;
import oncall.view.InputView;
import oncall.view.OutputView;

public abstract class OnCallConfig {
    public static OnCallController createController() {
        return new OnCallController(createInputView(), new OutputView());
    }

    private static InputView createInputView() {
        return new InputView(new InputValidator(), new InputParser());
    }
}
