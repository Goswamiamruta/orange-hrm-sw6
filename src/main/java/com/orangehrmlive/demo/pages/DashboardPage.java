package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//img[@class='oxd-userdropdown-img'])[1]")
    WebElement profilePhoto;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "(//h5[normalize-space()='Login'])[1]")
    WebElement loginPanel;

    public void clickOnProfilePhoto() {
        clickOnElement(profilePhoto);
        log.info("profilePhoto" + profilePhoto.toString());

    }

    public void clickOnLogOut() {
        log.info("logout" + logOut.toString());

        clickOnElement(logOut);

    }

    public String getLoginPanel() {
        String message = getTextFromElement(loginPanel);
        log.info("loginPanel" + loginPanel.toString());

        return message;
    }
}
