package tests;

import org.testng.annotations.Test;
import pages.object.HomePage;

public class HomeTest extends BaseTest {

    private String updatedCurrency = "EUR";

    @Test
    public void currencyCanBeChangedToEurTest () {
        HomePage.clickOnChangeButton();
        HomePage.selectCurrency();
        HomePage.saveCurrency();
        HomePage.checkSavedCurrency(updatedCurrency);
    }
}
