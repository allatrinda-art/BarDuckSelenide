package tests;

import org.testng.annotations.Test;
import pages.object.CartPage;
import pages.object.CatalogPage;
import pages.object.HomePage;
import pages.object.ItemPage;

public class CartTest extends BaseTest {

    private String cartMessage = "There are no items in your cart.";

    @Test
    public void itemCanBeRemovedInCartTest () throws InterruptedException {
        ItemPage itemPage = new ItemPage();

        HomePage.categoryMenuClick();
        CatalogPage.selectItemInTheGrid();
        itemPage.addItemToCart();
        HomePage.getCartQuantity();
        HomePage.cartClick();
        CartPage.removeButtonClick();
        CartPage.validateRemovalMessage(cartMessage);
    }
}
