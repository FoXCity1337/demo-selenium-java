package com.netflix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1(){WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_LOGIN_FIELD,loginPage.getActualMessageWithPassword());
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD,loginPage.getActualMessageWithLogin());
    }

    @Test
    public void test2(){WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillLoginField("12345@mail.ru");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD,loginPage.getActualMessageWithLogin());
    }


}
