package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement hrmLogo;
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement displayLogo;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[1]")
    WebElement errorMessage;

    public void hrmLogo() {
        log.info("hrmLogo" + hrmLogo.toString());
        driver.findElement((By) hrmLogo).isDisplayed();
    }

    public String displayLogoHome() {
        log.info("displayLogo" + displayLogo.toString());

        return getTextFromElement(displayLogo);

    }

    public String verifyLogin() {
        log.info("verifyLogoPannel" + verifyLogin().toString());
        return getTextFromElement(verifyLoginPanel);

    }

    public String getErrorMessage() {
        log.info("errormessage" + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }

}