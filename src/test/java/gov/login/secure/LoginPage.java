package gov.login.secure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillLoginField(String login) {
        By loginBy = By.xpath(LoginXpath.LOGIN_LOCATOR);
        WebElement loginWebElement = webDriver.findElement(loginBy);
        loginWebElement.sendKeys(login);
    }

    public void fillPasswordField(String password) {
        By passwordBy = By.xpath(LoginXpath.PASSWORD_LOCATOR);
        WebElement passwordWebElement = webDriver.findElement(passwordBy);
        passwordWebElement.sendKeys("password");
    }

    public void clickSignInButton() {
        By signInButtonBy = By.xpath(LoginXpath.SIGN_IN_BUTTON_LOCATOR);
        WebElement signInButtonWebElement = webDriver.findElement(signInButtonBy);
        signInButtonWebElement.click();
    }

    public String getEmptyLoginFieldMessage() {
        By textMessageBy = By.xpath(LoginXpath.EMPTY_LOGIN_FIELD_LOCATOR);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

    public String getEmptyPasswordFieldMessage() {
        By textMessageBy = By.xpath(LoginXpath.EMPTY_PASSWORD_FIELD_LOCATOR);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

    public String getMessageWithWrongFields() {
        By textMessageBy = By.xpath(LoginXpath.WRONG_PASSWORD_FIELD_LOCATOR);
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }
}
