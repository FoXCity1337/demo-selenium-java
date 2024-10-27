package mall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillPhoneNumberField(String number) {
        By phoneNumberBy = By.xpath(LoginXpath.PHONE_NUMBER_FIELD_XPATH);
        WebElement phoneNumberWebDriver = webDriver.findElement(phoneNumberBy);
        phoneNumberWebDriver.sendKeys(number);
    }

    public void fillPasswordField(String password) {
        By paswordBy = By.xpath(LoginXpath.PASSWORD_FIELD_XPATH);
        WebElement passwordWebDriver = webDriver.findElement(paswordBy);
        passwordWebDriver.sendKeys(password);
    }

    public void clickLoginButton() {
        By loginButtonBy = By.xpath(LoginXpath.LOGIN_BUTTON_XPATH);
        WebElement loginButtonWebDriver = webDriver.findElement(loginButtonBy);
        loginButtonWebDriver.click();
    }

    public String getErrorMessage() {
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        By textMessage = By.xpath(LoginXpath.ERROR_MESSAGE_XPATH);
        WebElement textMessageWebElement = webDriver.findElement(textMessage);
        return textMessageWebElement.getText();
    }
}
