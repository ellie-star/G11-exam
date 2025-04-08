package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilialePage extends ParentPage {

    @FindBy(xpath = "//h1")
    private WebElement titleFilialePage;

    private String expectedTitle = "Alle Angebote deiner Lidl Filiale auf einen Blick.";

    public FilialePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/store";
    }

    public FilialePage checkIsRedirectToFilialePage() {
        checkUrl();
        return this;
    }

    public FilialePage checkTitleIsCorrect() {
        checkTextInElement(titleFilialePage, expectedTitle);
        return this;
    }
}
