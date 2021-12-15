package com.demo.automation.pageobjects;
import com.demo.automation.models.DataInjection;
import com.demo.automation.utils.Times;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login")

public class RegisterPage extends PageObject {
    DataInjection dataInjection = new DataInjection();
    String [] dataForm = dataInjection.dataForm();
    public By txt_Username = By.id("txt-username");
    public By txt_Password = By.id("txt-password");
    public By btn_Login = By.id("btn-login");
    public By lst_Facility = By.xpath("//option[@value='"+dataForm[0]+"']");
    public By chk_Apply = By.id("chk_hospotal_readmission");
    public By rad_Program = By.xpath("//input[@value='"+dataForm[1]+"']");
    public By dat_Visit = By.id("txt_visit_date");
    public By txtT_Comment = By.id("txt_comment");
    public By btn_Book = By.id("btn-book-appointment");
    public By lbl_Confirmation = By.xpath("//h2[contains(text(), 'Appointment Confirmation')]");

    public RegisterPage() throws IOException {
    }

    public void LoginPortal() throws InterruptedException, IOException {
        getDriver().manage().window().maximize();
        String [] dataLogin = dataInjection.dataLogin();
        getDriver().findElement(txt_Username).sendKeys(dataLogin[1]);
        Times.waitFor(1000);
        getDriver().findElement(txt_Password).sendKeys(dataLogin[2]);
        Times.waitFor(1000);
        getDriver().findElement(btn_Login).click();
        Times.waitFor(2000);
    }

    public void Form() throws InterruptedException, IOException {
        String [] dataForm = dataInjection.dataForm();
        getDriver().findElement(lst_Facility).click();
        Times.waitFor(1000);
        getDriver().findElement(chk_Apply).click();
        Times.waitFor(1000);
        getDriver().findElement(rad_Program).click();
        Times.waitFor(1000);
        getDriver().findElement(dat_Visit).sendKeys(dataForm[2]);
        Times.waitFor(1000);
        getDriver().findElement(txtT_Comment).click();
        Times.waitFor(1000);
        getDriver().findElement(txtT_Comment).sendKeys(dataForm[3]);
        Times.waitFor(1000);
        getDriver().findElement(btn_Book).click();
        Times.waitFor(2000);
    }

    public void validations() throws InterruptedException, IOException {
        String [] dataValidations = dataInjection.dataValidations();
        assertEquals(getDriver().findElement(lbl_Confirmation).getText(), dataValidations[0]);
        System.out.println("Respuesta del sistema: " + getDriver().findElement(lbl_Confirmation).getText());
        Times.waitFor(5000);
    }
}
