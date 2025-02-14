package pages.object;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage extends BasePage{

    private static By purpleDuck = By.cssSelector("img[class='image'][alt='Purple Duck']");
    private static By itemInCatalog = By.cssSelector("a[title='Yellow Duck']");

    public CatalogPage() {
        super();
    }

    public static void selectItemInTheGrid() {
        $(purpleDuck).click();
    }

    public static void selectItemInSubCategory() {
        $(itemInCatalog).click();
    }

}
