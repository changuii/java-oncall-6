package oncall;

import oncall.config.OnCallConfig;
import oncall.controller.OnCallController;

public class Application {
    public static void main(String[] args) {
        OnCallController controller = OnCallConfig.createController();
        controller.run();
    }
}
