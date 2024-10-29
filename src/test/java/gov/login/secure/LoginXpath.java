package gov.login.secure;

public class LoginXpath {
    public static final String LOGIN_LOCATOR = "//input[@name='user[email]']";
    public static final String PASSWORD_LOCATOR = "//input[@name='user[password]']";
    public static final String SIGN_IN_BUTTON_LOCATOR = "//button[@name = 'button']";
    public static final String EMPTY_LOGIN_FIELD_LOCATOR = "//div[@class=\"usa-error-message\"]";
    public static final String EMPTY_PASSWORD_FIELD_LOCATOR = "//div[@class=\"usa-error-message\"]";
    public static final String WRONG_PASSWORD_FIELD_LOCATOR = "//div[@class='usa-alert__body']";
}
