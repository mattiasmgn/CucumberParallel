package se.ff.cc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class F1StepDefs {

    long SLEEP=1000L;

    @Given("^some start condition$")
    public void some_start_condition() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f1 a");
    }

    @When("^something is done$")
    public void something_is_done() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f1 b");
    }

    @Then("^something should happen$")
    public void something_should_happen() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f1 c");
    }

}
