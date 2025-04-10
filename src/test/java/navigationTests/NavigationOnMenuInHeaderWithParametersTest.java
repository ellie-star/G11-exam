package navigationTests;

import baseTests.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class NavigationOnMenuInHeaderWithParametersTest extends BaseTest {

    @Test
    @Parameters(method = "optionsForNavigation")
    public void T004_navigationOnMenuInHeaderWithParameters(List<String> optionsForNavigation) {

        pageProvider.getHomePage().openPage();

        for (String menuItem : optionsForNavigation) {
            switch (menuItem) {
                case "Onlineshop":
                    pageProvider.getOnlineshopPage().getHeaderElements().navigateMenuToOnlineShopAndVerify();
                    break;
                case "Filiale":
                    pageProvider.getFilialePage().getHeaderElements().navigateMenuToFilialeAndVerify();
                    break;
                case "Home":
                    pageProvider.getHomePage().getHeaderElements().navigateMenuToHomeAndVerify();
                    break;
                default:
                    throw new IllegalArgumentException("   !!!UNKNOWN MENU ITEM: " + menuItem);
            }
        }
    }

    public List<List<String>> optionsForNavigation() {
        return Arrays.asList(
                Arrays.asList("Onlineshop", "Filiale", "Home"),
                Arrays.asList("Home", "Onlineshop"),
                Arrays.asList("Filiale", "Home", "Onlineshop", "Filiale"),
                Arrays.asList("Home", "Onlineshop", "Filiale", "Onlineshop", "Home")
        );
    }
}
