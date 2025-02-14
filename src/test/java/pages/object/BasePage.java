package pages.object;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public String getTitle() {
        return $("title").getText();
    }
}
