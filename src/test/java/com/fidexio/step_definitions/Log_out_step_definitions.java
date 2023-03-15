package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.LogoutPage;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Log_out_step_definitions {

    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @Given("user  is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));

    }

    @Given("user logged in with  valid credential")
    public void user_logged_in_with_valid_credential() {
        loginPage.email.sendKeys("posmanager11@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
    }

    @When("user clicks username at the right top  of  the  corner")
    public void user_clicks_username_at_the_right_top_of_the_corner() {
        logoutPage.usernamebtn.isDisplayed();
    }

    @When("user clicks log out button")
    public void user_clicks_log_out_button() {
        logoutPage.usernamebtn.click();
        logoutPage.logoutbtn.click();
    }

    @Then("user goes back to login page")
    public void user_goes_back_to_login_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Login | Best solution for startups";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("user press back key on the keyboard")
    public void userPressBackKeyOnTheKeyboard() {
        loginPage.loginBtn.sendKeys(Keys.BACK_SPACE);
    }

    @And("user is still on the page")
    public void userIsStillOnThePage() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Login | Best solution for startups";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
