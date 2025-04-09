package org.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.utils.ConfigProvider;


public abstract class ParentPage extends CommonActionsWithElements{

    Logger logger = Logger.getLogger(getClass());

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected String baseUrl = ConfigProvider.configProperties.base_url();

    abstract protected String getRelativeUrl();

    public HeaderElements getHeaderElements(){
        return new HeaderElements(webDriver);
    }

    protected void checkUrl() {
        Assert.assertEquals("URL is not expected"
                , baseUrl + getRelativeUrl()
                , webDriver.getCurrentUrl());
        logger.info(baseUrl + getRelativeUrl() + " was checked");
    }

    protected void checkUrlWithPattern(String text) {
        String expectedUrlPattern = baseUrl + getRelativeUrl();
        String expectedUrl = String.format(expectedUrlPattern, text);
        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertTrue("URL is not expected \n" +
                        "Expected url: " + expectedUrl +
                        "\n Actual url: " + actualUrl,
                actualUrl.equals(expectedUrl));
    }
}
