package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#login-actions")
    WebElement loginLink;

    @FindBy(xpath = "//h4[text()='Login or Signup to your account']")
    WebElement loginPage;
    
    @FindBy(className = "LoginForm_textField__t2gf6")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@value ='continue']")
    WebElement continueBtn;

    @FindBy(xpath = "//input[@class = 'LoginForm_textField__t2gf6' and @placeholder = 'Enter otp']")
    WebElement otpNumber;
    
    @FindBy(xpath = "//input[@value ='Continue']")
    WebElement continueButton;

    @FindBy(className = "Toastify__toast-body")
    WebElement errorMsg;

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public boolean isLoginPageDisplayed() {
        return loginPage.isDisplayed();
    }

    public void enterPhoneNumber() {
        phoneNumber.sendKeys(ConfigReader.getConfigValue("login.phone"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void enterInvalidOtp(String otpNum) {
        otpNumber.sendKeys(otpNum);
    }

    public void clickOnContinue() {
        continueButton.click();
    }

    public boolean isErrorMsgDisplayed() {
        return errorMsg.isDisplayed();
    }
}
