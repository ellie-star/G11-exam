package org.pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage(){
        return new HomePage(webDriver);
    }

    public OnlineshopPage getOnlineshopPage(){
        return new OnlineshopPage(webDriver);
    }

    public NewsletterRegistrationPage getNewsletterRegistrationPage(){
        return new NewsletterRegistrationPage(webDriver);
    }

    public FilialePage getFilialePage(){return new FilialePage(webDriver);}

    public ResultOfSearchPage getResultOfSearchPage(){return new ResultOfSearchPage(webDriver);}


}
