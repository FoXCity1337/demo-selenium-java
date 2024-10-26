package gov.login.secure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By submitButtonBy = new By.ByXPath(xpath);
        WebElement submitButtonWebElement = webDriver.findElement(submitButtonBy);
        submitButtonWebElement.click();
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By emailFieldBy = new By.ByXPath(xpath);
        WebElement emailFieldWebElement = webDriver.findElement(emailFieldBy);
        emailFieldWebElement.sendKeys("testA@test.com");

        xpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By submitButtonBy = By.xpath(xpath);
        WebElement submitButtonWebElement = webDriver.findElement(submitButtonBy);
        submitButtonWebElement.click();
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By passwordFieldBy = new By.ByXPath(xpath);
        WebElement passwordFieldWebElement = webDriver.findElement(passwordFieldBy);
        passwordFieldWebElement.sendKeys("1q2w#E4r");

        xpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By submitButtonBy = By.xpath(xpath);
        WebElement submitButtonWebElement = webDriver.findElement(submitButtonBy);
        submitButtonWebElement.click();
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By emailFieldBy = new By.ByXPath(xpath);
        WebElement emailFieldWebElement = webDriver.findElement(emailFieldBy);
        emailFieldWebElement.sendKeys("testB@test.com");

        xpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By passwordFieldBy = By.xpath(xpath);
        WebElement passwordFieldWebElement = webDriver.findElement(passwordFieldBy);
        passwordFieldWebElement.sendKeys("a1S@d3F$");

        xpath = "//*[@id=\"new_user\"]/lg-captcha-submit-button/lg-spinner-button/button";
        By submitButtonBy = By.xpath(xpath);
        WebElement submitButtonWebElement = webDriver.findElement(submitButtonBy);
        submitButtonWebElement.click();
    }
}
