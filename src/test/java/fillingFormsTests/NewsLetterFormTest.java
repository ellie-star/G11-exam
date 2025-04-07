package fillingFormsTests;

import baseTests.BaseTest;
import com.github.javafaker.Faker;
import org.junit.Test;

public class NewsLetterFormTest extends BaseTest {
    String currentEmail = "allena.learn+test@gmail.com";
    Faker faker = new Faker();

    @Test
    public void T001_subscribeToNewsletter() {
        pageProvider.getHomePage().openPage().clickOnButtonBecomeLidlFan();
        pageProvider.getNewsletterRegistrationPage()
                .checkIsRedirectToNewsLetterPage()
                .enterTextIntoPreName(faker.name().firstName())
                .enterTextIntoLastName(faker.name().lastName())
                .enterTextIntoEmail(currentEmail)
                .clickOnButtonRegister();

        pageProvider.getNewsletterRegistrationPage().checkSuccessMessage();
    }

}
