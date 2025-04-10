package org.pages.productPages;

import org.openqa.selenium.WebDriver;

public class SuperSalePage extends ProductParentPage{

    public SuperSalePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/q/query/supersale";
    }

    @Override
    protected String getNameProductPage() {
        return "Supersale";
    }

    public SuperSalePage checkRedirectToSuperSalePage() {
        checkRedirectToPage(getNameProductPage());
        return this;
    }

}