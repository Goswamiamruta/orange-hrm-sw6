package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    static WebElement verifyAddUserText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmployeeName;
    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    WebElement enterTheUserName;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRoleSelect;
    @CacheLookup
    @FindBy(xpath = "//[@class='oxd-select-wrapper']//[contains(text(),'Enabled')]")
    WebElement selectEnable;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Cheeku123')]")
    WebElement verifyTheResult;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement tickOnCheckbox;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement clickOnDeleteButton;
    @CacheLookup
    @FindBy(xpath = ("(//div[@role='document'])[1]"))
    WebElement popUpWindow;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Yes, Delete']"))
    WebElement yesButton;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Reset']"))
    WebElement reSetButton;
    @CacheLookup
    @FindBy(xpath = ("//label[normalize-space()='Username']"))
    WebElement verifyUsername;
    @CacheLookup
    @FindBy(xpath = ("//span[normalize-space()='No Records Found']"))
    WebElement noRecordFound;


    public String setVerifyAddUserText() {
        log.info("verify Add user " + verifyAddUserText.toString());

        return getTextFromElement(verifyAddUserText);
    }

    public void setEnterEmployeeName(String employeeName) {
        sendTextToElement(enterEmployeeName, employeeName);
        log.info("enterEmployeeName " + enterEmployeeName.toString());

    }

    public void setEnterTheUserName(String userName) {
        sendTextToElement(enterTheUserName, userName);
        log.info("enterTheUserName " + enterTheUserName.toString());

    }

    public void setSelectDisable() {
        selectByIndexFromDropDown(selectDisable, 0);
        log.info("selectDisable " + selectDisable.toString());

    }

    public void setConfirmPassword(String password) {
        sendTextToElement(confirmPassword, password);
        log.info("confirmPassword " + confirmPassword.toString());

    }

    public void setClickOnSaveButton() {
        clickOnElement(clickOnSaveButton);
        log.info("(clickOnSaveButton " + clickOnSaveButton.toString());
    }

    public void setUserRoleSelect(String value) {
        selectByVisibleTextFromDropDown(userRoleSelect, value);
        log.info("userRoleSelect " + userRoleSelect.toString());

    }

    public void selectStatusEnable(String value) {
        selectByVisibleTextFromDropDown(selectEnable, value);
        log.info("selectEnable " + selectEnable.toString());

    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info("searchButtone " + searchButton.toString());
    }

    public String setVerifyTheResult() {
        log.info("verifyTheResult " + verifyTheResult.toString());
        return getTextFromElement(verifyTheResult);

    }

    public void setTickOnCheckbox() {
        clickOnElement(tickOnCheckbox);
        log.info("tickOnCheckbox " + tickOnCheckbox.toString());
    }

    public void setClickOnDeleteButton() {
        clickOnElement(clickOnDeleteButton);
        log.info("clickOnDeleteButton " + clickOnDeleteButton.toString());
    }

    public void verifyThePopUpWindowIsDisplayed() {
        verifyThatElementIsDisplayed(popUpWindow);
        log.info("popUpWindow " + popUpWindow.toString());
    }

    public void clickOnYesButton() {
        clickOnElement(yesButton);
        log.info("yesButton " + yesButton.toString());
    }

    public void verifyNoRecordFoundMessage(String text) {
        verifyThatTextIsDisplayed(noRecordFound, text);
        log.info("noRecordFound" + noRecordFound.toString());
    }

    public void verifyUsernameLabel(String text) {
        verifyThatTextIsDisplayed(verifyUsername, text);
        log.info("verifyUsernamee " + verifyUsername.toString());
    }

    public void clickOnReSetButton() {
        clickOnElement(reSetButton);
        log.info("reSetButton " + reSetButton.toString());
    }
}
