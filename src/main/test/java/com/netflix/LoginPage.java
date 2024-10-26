package com.netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver webDriver;
    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillLoginField(String login){
        By loginBy = By.xpath(LoginXpath.LOGIN_FIELD);
        WebElement loginWebElement = webDriver.findElement(loginBy);
        loginWebElement.sendKeys(login);
    }

    public void fillPasswordField(String password){
        By passwordBy = By.xpath(LoginXpath.PASSWORD_FIELD);
        WebElement passwordWebElement = webDriver.findElement(passwordBy);
        passwordWebElement.sendKeys(password);
    }

    public void clickLoginButton(){
        By loginButtonBy = By.xpath(LoginXpath.LOGIN_BUTTON);
        WebElement loginButtonWebElement = webDriver.findElement(loginButtonBy);
        loginButtonWebElement.click();
    }

    public String getActualMessageWithLogin(){
        By textMessageBy = By.xpath(LoginXpath.EMPTY_PASSWORD_FIELD_MESSAGE);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

    public String getActualMessageWithPassword(){
        By textMessageBy = By.xpath(LoginXpath.EMPTY_LOGIN_FIELD_MESSAGE);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

    public String getActualMessageWithWrongFields(){
        By textMessageBy = By.xpath(LoginXpath.WRONG_FIELD_MESSAGE);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

}
