package pages.object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage{

    private static By categoryMenu = By.cssSelector("#site-menu .category-1>a");
    private static By cartQuantity = By.cssSelector("#cart span.quantity");
    private static By cart = By.cssSelector(".content>strong");
    private static By menuSubCategory = By.cssSelector("#site-menu .category-2 a");
    private static By changeButton = By.cssSelector(".fancybox-region");
    private static By currency = By.cssSelector("select[name='currency_code']");
    private static By saveButton = By.cssSelector("button[name='save']");
    private static By savedCurrency = By.cssSelector("div.currency span");

    public HomePage() {
        super();
    }

    public static void categoryMenuClick() {
       $(categoryMenu).click();
    }

    public static void getCartQuantity() {
        SelenideElement element = $(cartQuantity);
        String oldAmount = element.getText().trim();
        element.shouldNotHave(text(oldAmount));
    }

    public static void cartClick() {
        $(cart).click();
    }

    public static void selectSubCategory() {
        $(categoryMenu).hover();
        $(menuSubCategory).click();
    }

    public static void clickOnChangeButton() {
        $(changeButton).click();
    }

    public static void selectCurrency() {
        Select dropdown = new Select($(currency));
        dropdown.selectByVisibleText("Euros");
    }

    public static void saveCurrency() {
        $(saveButton).click();
    }

    public static void checkSavedCurrency(String currency) {
        $(savedCurrency).shouldHave(text(currency));
    }
}
