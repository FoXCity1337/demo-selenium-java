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
}
