package tests;

import org.testng.annotations.Test;
import pages.object.CatalogPage;
import pages.object.HomePage;
import pages.object.ItemPage;

public class ItemsTest extends BaseTest{



    @Test
    public void userCanAddItemToCartTest () {
        ItemPage itemPage = new ItemPage();

        HomePage.categoryMenuClick();
        CatalogPage.selectItemInTheGrid();
        itemPage.addItemToCart();
        HomePage.getCartQuantity();
    }

    @Test
    public void itemDetailsIsDisplayedTest () {
        HomePage.selectSubCategory();
        CatalogPage.selectItemInSubCategory();
        ItemPage.clickOnDetails();
        ItemPage.detailsInfoIsDisplayed();
    }
}
