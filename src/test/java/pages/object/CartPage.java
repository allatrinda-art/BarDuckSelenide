package pages.object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage{

    private static By removeButton = By.cssSelector("button[name='remove_cart_item']");
    private static By noItemsText = By.cssSelector("#checkout-cart-wrapper em");

    public CartPage() {
        super();
    }

    public static void removeButtonClick() {
        $(removeButton).click();
    }

    public static void validateRemovalMessage(String removalMessage) {
        $(noItemsText).shouldHave(text(removalMessage));
    }
}
