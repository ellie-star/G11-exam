package filterForProductsTests;

import baseTests.BaseTest;
import org.junit.Test;

public class selectValueInBMTest extends BaseTest {

    @Test
    public void T005_selectValueInBMTest() {
        pageProvider.getHomePage().openPage()
                .getHeaderElements()
                .clickOnSaleInBurgerMenu();
        pageProvider.getSuperSalePage().checkRedirectToSuperSalePage();

    }

}
