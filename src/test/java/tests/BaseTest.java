package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.object.enums.Browser;

import static com.codeborne.selenide.Browsers.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    protected void setUp()    {
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        Configuration.browser = switch (browser) {
            case chrome -> CHROME;
            case firefox -> FIREFOX;
            case edge -> EDGE;
            case safari -> SAFARI;
        };
        Configuration.pageLoadTimeout = 5000;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
        open("http://litecart.stqa.ru/en/");
    }
}