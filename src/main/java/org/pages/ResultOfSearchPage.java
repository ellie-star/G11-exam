package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultOfSearchPage extends ParentPage {

    @FindBy(xpath = "//h1")
    private WebElement exceptedWordOfResult;

    @FindBy(xpath = "//section[@class='s-page-heading']//span")
    private WebElement numberOfResults;

    @FindBy(xpath = "//button[@aria-controls='Kategorie']")
    private WebElement buttonKategorie;

    public ResultOfSearchPage(WebDriver webDriver) {super(webDriver);}

    @Override
    protected String getRelativeUrl() {return "/q/search?q=%s";}

    public ResultOfSearchPage checkRedirectToResultOfSearchPage(String wordForSearch) {
        checkUrlWithPattern(wordForSearch);
        return this;
    }

    public ResultOfSearchPage checkSearchedWordIsVisible(String wordForSearch) {
        checkTextInElement(exceptedWordOfResult, wordForSearch);
        return this;
    }

    public ResultOfSearchPage checkFilterOnPageIsVisible() {
        checkIsElementVisible(buttonKategorie);
        return this;
    }

    public void getResultOfSearch(String wordForSearch) {
        String text = getTextFromElement(numberOfResults);
        logger.info("We were looking for '" + wordForSearch
                + "', was found " + text);
    }

}
