package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.productPages.GardenAndBalkonProductPage;

public class OnlineshopPage extends ParentPage {

    @FindBy(xpath = "//h1")
    private WebElement titleOnlineShopPage;

    private String expectedTitle =
            "Jetzt die Onlineshop-Kategorien entdecken und vieles mehr!";

    @FindBy(xpath = "//li[@class='ux-base-slider__slide']//a[@href='/h/garten-balkon/h10006533']")
    private WebElement tileCategoryGarden;

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

    public OnlineshopPage checkTitleIsCorrect() {
        checkTextInElement(titleOnlineShopPage, expectedTitle);
        return this;
    }

    public GardenAndBalkonProductPage clickOnTileGardenAndBalkon() {
        clickOnElement(tileCategoryGarden);
        return new GardenAndBalkonProductPage(webDriver);
    }

}