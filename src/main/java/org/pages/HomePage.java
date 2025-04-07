package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//footer//a[@href='https://www.lidl.de/c/newsletter-anmeldeseite/s10005754']")
    private WebElement buttonBecomeLidlFan;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public HomePage openPage() {
        webDriver.get(baseUrl);
        logger.info("Page was opened with url " + baseUrl);

        webDriverWait10.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("onetrust-reject-all-handler"))).click();
        logger.info("Cookies is not accepted");
        return this;
    }

    public NewsletterRegistrationPage clickOnButtonBecomeLidlFan() {
        clickOnElement(buttonBecomeLidlFan);
        return new NewsletterRegistrationPage(webDriver);
    }

    public HomePage checkIsRedirectToHomePage() {
        checkUrl();
        return this;
    }
}
