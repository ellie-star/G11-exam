package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderElements extends CommonActionsWithElements {

    @FindBy(xpath = "//a[@data-ga-action='Home']")
    private WebElement menuHome;

    @FindBy(xpath = "//nav[@class='n-navigation__top-menu']//a[@href='/online']")
    private WebElement menuOnlineShop;

    @FindBy(xpath = "//nav[@class='n-navigation__top-menu']//a[@href='/store']")
    private WebElement menuFiliale;


    public HeaderElements(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage clickOnMenuHome() {
        clickOnElement(menuHome);
        return new HomePage(webDriver);
    }

    public OnlineshopPage clickOnMenuOnlineShop(){
        clickOnElement(menuOnlineShop);
        return new OnlineshopPage(webDriver);
    }

    public FilialePage clickOnMenuFiliale(){
        clickOnElement(menuFiliale);
        return new FilialePage(webDriver);
    }

}
