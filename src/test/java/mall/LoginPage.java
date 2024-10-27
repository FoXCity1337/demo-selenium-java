package mall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillPhoneNumberField(String number){
        By phoneNumberBy = By.xpath(LoginXpath.PHONE_NUMBER_FIELD_XPATH);
        WebElement phoneNumberWebDriver = webDriver.findElement(phoneNumberBy);
        phoneNumberWebDriver.sendKeys(number);
    }

    public void fillPasswordField(String password){
        By paswordBy = By.xpath(LoginXpath.PHONE_NUMBER_FIELD_XPATH);
        WebElement phoneNumberWebDriver = webDriver.findElement(paswordBy);
        phoneNumberWebDriver.sendKeys(password);
    }
}
