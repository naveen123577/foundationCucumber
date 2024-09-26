package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = "#dropdownMenuLink")
    WebElement cartIcon;

    public void openWebsite() {
        driver.get("https://www.powerlook.in/");
    }

    public boolean isHomePageDisplayed() {
        return cartIcon.isDisplayed();
    }
}
