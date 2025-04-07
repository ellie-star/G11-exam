package org.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.utils.ConfigProvider;


public abstract class ParentPage extends CommonActionsWithElements{

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected String baseUrl = ConfigProvider.configProperties.base_url();

    abstract protected String getRelativeUrl();

    protected void checkUrl() {
        Assert.assertEquals("URL is not expected"
                , baseUrl + getRelativeUrl()
                , webDriver.getCurrentUrl());
    }
}
