package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());
    @CacheLookup
    @FindBy(css = ".oxd-text.oxd-text--h6.orangehrm-main-title")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Admin')]")
    WebElement userRole;

    @CacheLookup
    @FindBy(css = "input[placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement username;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input'][normalize-space()='Enabled']")
    WebElement statusEnabled;

    @CacheLookup
    @FindBy(css = "div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    WebElement password;

    @CacheLookup
    @FindBy(css = "div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement saveButton;
    @CacheLookup
    @FindBy(id = "app")
    WebElement successfullySaved;


    public String getAddUserText() {
        log.info("getting add user text" + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    public void selectAdminText(String value) {
        log.info("Select user Role " + userRole.toString());
        selectByVisibleTextFromDropDown(userRole, value);

    }

    public void enterEmployeeName(String value) {
        log.info("Enter EmployeeName" + employeeName.toString());
        selectByVisibleTextFromDropDown(employeeName, value);
    }

    public void enterUserName1(String value) {
        log.info("Enter UserName" + username.toString());
        sendTextToElement(username, value);
    }

    public void selectStatus(String value) {
        log.info("Status" + statusEnabled.toString());
        selectByVisibleTextFromDropDown(statusEnabled, value);
    }

    public void enterPassword1(String value) {
        log.info("Enter password " + password.toString());
        sendTextToElement(password, value);
    }

    public void enterConfirmPassword(String value) {
        log.info("Enter password " + confirmPassword.toString());
        sendTextToElement(confirmPassword, value);
    }

    public void clickOnSaveButton() {
        log.info("Click on save button " + saveButton.toString());
        clickOnElement(saveButton);
    }

    public String verifySuccessfullySavedText() {
        log.info("Successfully Saved" + successfullySaved.toString());
        return getTextFromElement(successfullySaved);
    }


    }


