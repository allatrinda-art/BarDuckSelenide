package tests;

import org.testng.annotations.Test;
import pages.object.LoginPage;
import pages.object.helpers.Credentials;

public class LoginTest extends BaseTest{

    private String userEmail = Credentials.getProperty("email");
    private String userPassword = Credentials.getProperty("password");
    private String userName = Credentials.getProperty("name");
    private String loginSuccessMessage = "You are now logged in as %s.";

    @Test
    public void successfulLoginTest() {
        LoginPage.login(userEmail, userPassword);
        LoginPage.validateMessage(String.format(loginSuccessMessage, userName));
    }
}
