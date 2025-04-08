package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineshopPage extends ParentPage{

    @FindBy(xpath = "//h1")
    private WebElement titleOnlineShopPage;

    private String expectedTitle =
            "Jetzt die Onlineshop-Kategorien entdecken und vieles mehr!";

    public OnlineshopPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/online";
    }

    public OnlineshopPage checkIsRedirectToOnlineshopPage() {
        checkUrl();
        return this;
    }

    public OnlineshopPage checkTitleIsCorrect(){
        checkTextInElement(titleOnlineShopPage, expectedTitle);
        return this;
    }
}
