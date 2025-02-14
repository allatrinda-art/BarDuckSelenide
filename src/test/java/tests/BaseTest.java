package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    protected void setUp()    {
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 5000;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
        open("http://litecart.stqa.ru/en/");

//        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome").toLowerCase());
//        driver = switch(browser) {
//            case chrome -> {
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--ignore-certificate-errors");
//                yield new ChromeDriver();
//            }
//            case firefox -> new FirefoxDriver();
//            case edge -> new EdgeDriver();
//            case safari -> new SafariDriver();
//        };
//        driver.manage().timeouts().getScriptTimeout();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
