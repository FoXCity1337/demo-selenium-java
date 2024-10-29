package mall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;
    LoginPage loginPage;

    @BeforeEach
    public void setUp(){
        webDriver = new ChromeDriver();
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() {
        webDriver.navigate().to("https://emall.by/login/password");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_FIELDS_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void Test2() {
        webDriver.navigate().to("https://emall.by/login/password");
        loginPage.fillPhoneNumberField("291384125");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void Test3() {
        webDriver.navigate().to("https://emall.by/login/password");
        loginPage.fillPasswordField("12345qwerty");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PHONE_NUMBER_FIELD_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void Test4() {
        webDriver.navigate().to("https://emall.by/login/password");
        loginPage.fillPhoneNumberField("291384125");
        loginPage.fillPasswordField("12345qwerty");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.WRONG_EMAIL_OR_PASSWORD_MESSAGE, loginPage.getErrorMessage());
    }
}
