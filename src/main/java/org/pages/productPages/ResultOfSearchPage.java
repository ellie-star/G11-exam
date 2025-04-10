package org.pages.productPages;

import org.openqa.selenium.WebDriver;

public class ResultOfSearchPage extends ProductParentPage {

    public ResultOfSearchPage(WebDriver webDriver) {super(webDriver);}

    @Override
    protected String getRelativeUrl() {return "/q/search?q=%s";}

    @Override
    protected String getNameProductPage() {
        return "";
    }

    public ResultOfSearchPage checkRedirectToResultOfSearchPage(String wordForSearch) {
        checkRedirectToPage(wordForSearch);
        return this;
    }

    public void getResultOfSearch(String wordForSearch) {
        String text = getTextFromElement(numberOfResults);
        logger.info("We were looking for '" + wordForSearch
                + "', was found " + text);
    }

}
