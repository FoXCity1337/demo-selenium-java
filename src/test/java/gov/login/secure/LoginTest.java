package gov.login.secure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickSignInButton();
        Assertions.assertEquals(LoginMessage.EMPTY_LOGIN_FIELD, loginPage.getEmptyLoginFieldMessage());
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD, loginPage.getEmptyPasswordFieldMessage());
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillLoginField("testA@test.com");
        loginPage.clickSignInButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD, loginPage.getEmptyPasswordFieldMessage());
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillPasswordField("1q2w#E4r");
        loginPage.clickSignInButton();
        Assertions.assertEquals(LoginMessage.EMPTY_LOGIN_FIELD, loginPage.getEmptyLoginFieldMessage());
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillLoginField("testB@test.com");
        loginPage.fillPasswordField("a1S@d3F$");
        loginPage.clickSignInButton();
        Assertions.assertEquals(LoginMessage.WRONG_PASSWORD, loginPage.getMessageWithWrongFields());
    }
}
