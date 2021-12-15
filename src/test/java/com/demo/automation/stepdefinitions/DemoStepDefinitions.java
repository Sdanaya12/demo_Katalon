package com.demo.automation.stepdefinitions;

import com.demo.automation.steps.RegisterPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class DemoStepDefinitions {
    @Steps
    RegisterPageSteps registerPageSteps;

    @Given("that a web user wants to access the Katalon demo portal")
    public void that_a_web_user_wants_to_access_the_katalon_demo_portal() throws InterruptedException { registerPageSteps.openBrowser();}

    @When("I have filled in the necessary fields")
    public void i_have_filled_in_the_necessary_fields() throws InterruptedException, IOException { registerPageSteps.loginPortal(); }

    @Then("you should see the form that has been filled out")
    public void you_should_see_the_form_that_has_been_filled_out() throws InterruptedException, IOException { registerPageSteps.form(); }

}
