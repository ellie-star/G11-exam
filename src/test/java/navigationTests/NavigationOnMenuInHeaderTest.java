package navigationTests;

import baseTests.BaseTest;
import org.junit.Test;

public class NavigationOnMenuInHeaderTest extends BaseTest {

    @Test
    public void T002_navigationOnMenuInHeader(){

        pageProvider.getHomePage().openPage()
                .getHeaderElements().clickOnMenuOnlineShop()
                .checkIsRedirectToOnlineshopPage()
                .checkTitleIsCorrect()
                .getHeaderElements().clickOnMenuFiliale()
                .checkIsRedirectToFilialePage()
                .checkTitleIsCorrect()
                .getHeaderElements().clickOnMenuHome()
                .checkIsRedirectToHomePage()
                .checkTitleHomePageIsNotVisible()
        ;

    }
}
