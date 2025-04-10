package org.pages.productPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.ParentPage;

public abstract class ProductParentPage extends ParentPage {

    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//section[@class='s-page-heading']//span")
    protected WebElement numberOfResults;

    @FindBy(xpath = "//h1")
    protected WebElement exceptedWordOfResult;

    public ProductParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    abstract protected String getRelativeUrl();

    abstract protected String getNameProductPage();

    public void checkRedirectToPage(String nameProductPage) {
        checkUrlWithPattern(nameProductPage);
        checkTextInElement(exceptedWordOfResult, nameProductPage);
        checkIsElementVisible(numberOfResults);
    }

}
