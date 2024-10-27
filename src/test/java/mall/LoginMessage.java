package mall;

public class LoginMessage {
    public static final String EMPTY_FIELDS_MESSAGE = "Поле \"Номер телефона\" обязательно для заполнения.\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
    public static final String EMPTY_PASSWORD_FIELD_MESSAGE =
            "Поле \"Пароль\" обязательно для заполнения.";
    public static final String EMPTY_PHONE_NUMBER_FIELD_MESSAGE =
            "Значение поля \"Номер телефона\" должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр " +
                    "(первая из которых не 0)";
    public static final String WRONG_EMAIL_OR_PASSWORD_MESSAGE = "Неверный логин или пароль";
}
