package org.pages;

import org.openqa.selenium.WebDriver;

public class FilialePage extends ParentPage{

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
}
