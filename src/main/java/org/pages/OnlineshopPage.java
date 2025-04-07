package org.pages;

import org.openqa.selenium.WebDriver;

public class OnlineshopPage extends ParentPage{

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
}
