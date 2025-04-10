package searchTests;

import baseTests.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SearchTest extends BaseTest {

    @Test
    @Parameters(method = "wordsForSearch")
    public void T003_validSiteSearchTest(String searchWord) {
        pageProvider.getHomePage().openPage().getHeaderElements()
                .enterTextIntoInputSearchAndClickOnButtonSearch(searchWord)
                .checkRedirectToResultOfSearchPage(searchWord)
                .getResultOfSearch(searchWord)
        ;
    }

    public Object[][] wordsForSearch() {
        return new Object[][]{
                {"milch"}, {"wine"}, {"sonne"}
        };
    }

}
