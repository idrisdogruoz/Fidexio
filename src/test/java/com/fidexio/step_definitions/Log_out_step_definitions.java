package com.fidexio.step_definitions;

import com.fidexio.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Log_out_step_definitions {

LogoutPage logoutPage = new LogoutPage();

    @Given("user  is on the login page")
    public void user_is_on_the_login_page() {
       logoutPage.usernamebtn.isDisplayed();
    }


    @And("user logged in with  valid credential")
    public void userLoggedInWithValidCredential() {
    }

    @When("user clicks username at the right top  of  the  corner")
    public void userClicksUsernameAtTheRightTopOfTheCorner() {
    }

    @And("user sees log out button")
    public void userSeesLogOutButton() {
    }

    @And("user clicks log out button")
    public void userClicksLogOutButton() {
    }

    @Then("user  goes back to login page")
    public void userGoesBackToLoginPage() {
    }

    @And("user press back key on the keyboard")
    public void userPressBackKeyOnTheKeyboard() {
    }

    @And("user is still on the page")
    public void userIsStillOnThePage() {
    }
}
