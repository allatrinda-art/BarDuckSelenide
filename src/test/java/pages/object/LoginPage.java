package pages.object;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{

    private static By emailInput = By.name("email");
    private static By passwordInput = By.name("password");
    private static By loginButton = By.name("login");
    private static By welcomeText = By.cssSelector("#notices>.notice");

    public LoginPage() {
        super();
    }

    public static void login(String email, String password) {
        $(emailInput).sendKeys(email);
        $(passwordInput).sendKeys(password);
        $(loginButton).click();
    }

    public static void validateMessage(String expectedMessage) {
        $(welcomeText).shouldHave(text(expectedMessage));
    }
}
