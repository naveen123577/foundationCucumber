package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    
    LoginPage loginPage = new LoginPage();

    @When("user clicks on the login link")
    public void user_clicks_on_the_login_link() {
        loginPage.clickOnLoginLink();
    }

    @Then("verify the user login page is displayed")
    public void verify_the_user_login_page_is_displayed() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enters the phone number")
    public void userEntersThePhoneNumber() {
        loginPage.enterPhoneNumber();
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() {
        loginPage.clickOnContinueBtn();
    }

    @And("user enters the invalid otp {string}")
    public void userEntersTheInvalidOtp(String otpNum) {
        loginPage.enterInvalidOtp(otpNum);
    }

    @And("user clicks on continue")
    public void userClicksOnContinue() throws InterruptedException {
        loginPage.clickOnContinue();
        Thread.sleep(3000);
    }

    @Then("verify the error message is displayed")
    public void verifyTheErrorMessageIsDisplayed() {
        Assert.assertTrue(loginPage.isErrorMsgDisplayed());
    }
}
