package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement admin;

    @CacheLookup
    @FindBy(xpath = " //h5[normalize-space()='System Users']")
    WebElement systemUserText;

    @CacheLookup
    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;

    public void clickOnAdminTab() {
        clickOnElement(admin);
        log.info("click on Admin" + admin.toString());
    }

    public String getSystemUserText() {
        log.info("Getting systemUser" + systemUserText.toString());
        return getTextFromElement(systemUserText);
    }

    public void clickOnAddButton() {
        log.info("click on add button" + addButton.toString());
        clickOnElement(addButton);
    }
}

