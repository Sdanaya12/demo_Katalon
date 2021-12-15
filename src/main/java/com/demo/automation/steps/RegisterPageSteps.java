package com.demo.automation.steps;

import com.demo.automation.pageobjects.RegisterPage;
import com.demo.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();
    public RegisterPageSteps() throws IOException {
    }

    @Step
    public void openBrowser() throws InterruptedException {
        registerPage.open();
        Times.waitFor(1000);
    }

    @Step
    public void loginPortal() throws InterruptedException, IOException {
        registerPage.LoginPortal();
        Times.waitFor(1000);
    }

    @Step
    public void form() throws InterruptedException, IOException {
        registerPage.Form();
        Times.waitFor(1000);
        registerPage.validations();
        Times.waitFor(1000);
    }
}
