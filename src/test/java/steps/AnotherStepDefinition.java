package steps;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unchecked")
public class AnotherStepDefinition {

    private ScenarioContext context;

    public AnotherStepDefinition(ScenarioContext context) {
        this.context = context;
    }

    @Then("print URL")
    public void printURL() {
        System.out.println(context.getData().getPropTransfer());
        context.getDriverFactory().getDriver().quit();
    }

    @When("save URL as (.+)")
    public void saveURL(String test) {
        context.getData().getPropTransfer().put(test, context.getDriverFactory().getDriver().getCurrentUrl());
        context.getData().getPropTransfer().get("");
    }
}

