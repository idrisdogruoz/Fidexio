package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import com.fidexio.utils.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    BrowserUtils browserUtils = new BrowserUtils();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
    }

    @When("User  enters valid email{string}")
    public void user_enters_valid_email_salesmanager6_info_com(String email) {
        loginPage.email.sendKeys(email);
    }

    @When("User enters valid password{string}")
    public void user_enters_valid_password_salesmanager(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginBtn.click();

    }

    @Then("User should be on the  homepage")
    public void user_should_be_on_the_homepage() {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }


    @When("User  enters invalid email{string}")
    public void userEntersInvalidEmail(String email) {
        loginPage.email.sendKeys(email);

    }

    @And("User enters invalid password{string}")
    public void userEntersInvalidPassword(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        Assert.assertTrue(loginPage.wrongLoginError.isDisplayed());
    }

    @When("user do not enter email or password")
    public void userDoNotEnterEmailOrPassword() {

    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginBtn.click();
    }


@Then("user see {string} warning message")
public void userSeeWarningMessage(String expectedMessage) {
    String actualMessageEmail = loginPage.email.getAttribute("validationMessage");
    String actualMessage=actualMessageEmail;
    String actualMessagePassword = loginPage.password.getAttribute("validationMessage");
    System.out.println("actualMessagePassword = " + actualMessagePassword);
    if (actualMessageEmail.isEmpty()) {
        actualMessage=actualMessagePassword;
    }
    System.out.println(actualMessage);
    Assert.assertTrue(expectedMessage.equals(actualMessage));
}
    @When("user enters valid password {string}")
    public void userEntersValidPassword(String password) {
        loginPage.password.sendKeys(password);
    }


    @When("user enters valid password salesmanager")
    public void userEntersValidPasswordSalesmanager() {
        String actualPasswordType = "password";
        String expectedPasswordType = loginPage.password.getAttribute("type");
        Assert.assertTrue(expectedPasswordType.equals(actualPasswordType));
    }


    @When("user click on the Reset password link")
    public void userClickOnTheResetPasswordLink() {
    }

    @Then("user land on the reset password page")
    public void userLandOnTheResetPasswordPage() {
    }

    @Then("user see the password in bullet signs")
    public void userSeeThePasswordInBulletSigns() {

    }


    @When("user enters valid email {string}")
    public void userEntersValidEmail(String email) {
        loginPage.email.sendKeys(email);
    }

    @And("user enters Enter key on the keyboard.")
    public void userEntersEnterKeyOnTheKeyboard() {
        loginPage.loginBtn.sendKeys(Keys.ENTER);
    }

    @Then("user is on home page")
    public void userIsOnHomePage() {
    }


}
