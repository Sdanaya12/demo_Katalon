package com.demo.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demo.feature", glue = "com.demo.automation.stepdefinitions", tags = "@smokeTest")
public class DemoRunner {
}
