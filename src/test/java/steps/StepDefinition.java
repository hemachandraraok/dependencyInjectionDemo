package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Given;

@SuppressWarnings("unchecked")
public class StepDefinition {

    private ScenarioContext context;

    public StepDefinition(ScenarioContext context) {
        this.context = context;
    }

    @Given("^launch (.+)$")
    public void justMethod1(String URL) throws InterruptedException {
        context.getDriverFactory().getDriver().get(URL);
        context.getData().getTest();
        context.getData().getPropTransfer().put("", "");
    }
}

