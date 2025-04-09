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

    @FindBy(xpath = "//input[@data-id='search-input-field']")
    private WebElement inputIntoSearch;

    @FindBy(xpath = "//button[@data-id='search-input-button']")
    private WebElement buttonToSearch;

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

    public ResultOfSearchPage enterTextIntoInputSearchAndClickOnButtonSearch(String wordForSearch){
        clearAndEnterTextIntoElement(inputIntoSearch,wordForSearch);
        clickOnElement(buttonToSearch);
        return new ResultOfSearchPage(webDriver);
    }


}
