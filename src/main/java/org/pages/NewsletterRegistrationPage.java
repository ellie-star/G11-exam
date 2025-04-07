package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewsletterRegistrationPage extends ParentPage {

    public NewsletterRegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//input[@name='fc_Prename']")
    private WebElement inputPreName;

    @FindBy(xpath = "//input[@name='fc_Lastname']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@name='fc_Email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//button[@name='btnZUM NEWSLETTER ANMELDEN']")
    private WebElement buttonRegister;

    @FindBy(xpath = "//h2[@style='color: green']")
    private WebElement successRegistrationMessage;

    private String expectedSuccessMessage =
            "Eine sehr gute Entscheidung! Bestätige jetzt deine Anmeldung zum Lidl Newsletter!";

    Logger logger = Logger.getLogger(getClass());

    @Override
    protected String getRelativeUrl() {
        return "/c/newsletter-anmeldeseite/s10005754";
    }

    public NewsletterRegistrationPage enterTextIntoPreName(String preName) {
        webDriver.switchTo().frame("ATheIFrame-10090880");
        webDriverWait10.until(
                ExpectedConditions.elementToBeClickable(inputPreName));
        clearAndEnterTextIntoElement(inputPreName, preName);
        return this;
    }

    public NewsletterRegistrationPage enterTextIntoLastName(String lastName){
        clearAndEnterTextIntoElement(inputLastName, lastName);
        return this;
    }

    public NewsletterRegistrationPage enterTextIntoEmail(String email){
        clearAndEnterTextIntoElement(inputEmail, email);
        return this;
    }

    public void clickOnButtonRegister(){
        clickOnElement(buttonRegister);
    }

    public NewsletterRegistrationPage checkIsRedirectToNewsLetterPage() {
        checkUrl();
        return this;
    }

    public void checkSuccessMessage(){
        checkTextInElement(successRegistrationMessage,expectedSuccessMessage);
    }
}