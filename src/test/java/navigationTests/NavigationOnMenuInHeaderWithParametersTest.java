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

        pageProvider.getHomePage().openPage().getHeaderElements()
                .checkMenu(optionsForNavigation);
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
