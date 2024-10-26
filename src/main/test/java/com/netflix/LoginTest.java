package com.netflix;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1(){WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
    }
}
