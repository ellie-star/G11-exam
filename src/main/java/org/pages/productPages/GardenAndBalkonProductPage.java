package org.pages.productPages;

import org.openqa.selenium.WebDriver;

public class GardenAndBalkonProductPage extends ProductParentPage {

    public GardenAndBalkonProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/h/garten-balkon/h10006533";
    }

    @Override
    protected String getNameProductPage() {
        return "Garten & Balkon Produkte";
    }

    public GardenAndBalkonProductPage checkRedirectToGardenPage(){
        checkRedirectToPage(getNameProductPage());
        return this;
    }

}
