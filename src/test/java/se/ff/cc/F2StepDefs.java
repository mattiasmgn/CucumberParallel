package se.ff.cc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F2StepDefs {

    long SLEEP=1000L;

    @Given("^some other start condition$")
    public void some_other_start_condition() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f2 1");
    }

    @When("^something is else done$")
    public void something_is_else_done() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f2 2");
    }

    @Then("^something else should happen$")
    public void something_else_should_happen() throws Throwable {
        Thread.sleep(SLEEP);
        System.out.println("f2 3");
    }


}
