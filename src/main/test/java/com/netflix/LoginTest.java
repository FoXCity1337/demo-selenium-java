package com.netflix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_LOGIN_FIELD, loginPage.getEmptyLoginFieldMessage());
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD, loginPage.getEmptyPasswordFieldMessage());
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillLoginField("12345@mail.ru");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD_FIELD, loginPage.getEmptyPasswordFieldMessage());
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillPasswordField("12345qwerty");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.EMPTY_LOGIN_FIELD, loginPage.getEmptyLoginFieldMessage());
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(webDriver);
        String email = "arseni11@gmail.com";
        loginPage.fillLoginField(email);
        loginPage.fillPasswordField("zxcvbasdf");
        loginPage.clickLoginButton();
        Assertions.assertEquals(LoginMessage.WRONG_PASSWORD + email, loginPage.getMessageWithWrongFields());
    }
}
