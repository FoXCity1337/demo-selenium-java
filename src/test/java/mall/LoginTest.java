package mall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void Test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_FIELDS_MESSAGE,loginPage.getErrorMessage());
    }

    @Test
    public void Test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillPhoneNumberField("291384125");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD_MESSAGE,loginPage.getErrorMessage());
    }

    @Test
    public void Test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillPasswordField("12345qwerty");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PHONE_NUMBER_FIELD_MESSAGE,loginPage.getErrorMessage());
    }
}
