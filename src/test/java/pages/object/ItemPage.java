package pages.object;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ItemPage extends BasePage{

    private static By addToCartButton = By.cssSelector("button[type='submit'][name='add_cart_product']");
    private static By detailsTab = By.cssSelector("a[href='#tab-details']");
    private static By detailsInfo = By.cssSelector("li.active a[href='#tab-details']");

    public ItemPage() {
        super();
    }

    public void addItemToCart() {
        $(addToCartButton).click();
    }

    public static void clickOnDetails() {
        $(detailsTab).click();
    }

    public static void detailsInfoIsDisplayed() {
        $(detailsInfo).shouldBe().isEnabled();
    }
}