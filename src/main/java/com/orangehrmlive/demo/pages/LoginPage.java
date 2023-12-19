package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnLogin;
    @CacheLookup
    @FindBy(css = "input[placeholder='Username']")
    WebElement userName;
    @CacheLookup
    @FindBy(css = "input[placeholder='Password']")
    WebElement passWard;


    public void enterUserName(String value) {
        sendTextToElement(userName, value);
        log.info("Enter UserName " + userName.toString());

    }
    public void enterPassWord(String value) {
        sendTextToElement(passWard, value);
        log.info("Enter password " + passWard.toString());

    }
    public void setClickOnLogin() {
        clickOnElement(clickOnLogin);
        log.info("click on login" + clickOnLogin.toString());
    }
}
