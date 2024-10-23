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
        String xpath = "/html/body/main/div/form/lg-submit-button/button";
        By by = new By.ByXPath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By by = new By.ByXPath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.sendKeys("testA@test.com");

        xpath = "/html/body/main/div/form/lg-submit-button/button";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.click();
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By by = new By.ByXPath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.sendKeys("1q2w#E4r");

        xpath = "/html/body/main/div/form/lg-submit-button/button";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.click();
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://secure.login.gov/");
        String xpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By by = new By.ByXPath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.sendKeys("testB@test.com");

        xpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.sendKeys("a1S@d3F$");

        xpath = "/html/body/main/div/form/lg-submit-button/button";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.click();
    }
}
