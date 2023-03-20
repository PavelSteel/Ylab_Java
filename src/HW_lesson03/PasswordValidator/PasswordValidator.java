package HW_lesson03.PasswordValidator;

public class PasswordValidator {

    public static void main(String[] args) {
        System.out.println(passwordValidator("login_1", "password_1", "password_1"));
        System.out.println(passwordValidator("login_1", "Пароль_1", "Пароль_1"));
        System.out.println(passwordValidator("login@1", "password_1", "password_1"));
        System.out.println(passwordValidator("login_2", "password_2", "password_1"));
        System.out.println(passwordValidator("login77777777777777777777777777777", "password_2", "password_1"));


    }

    public static boolean passwordValidator(String login, String password, String confirmPassword) {
        boolean resLogin = false;
        boolean resPassword = false;

        try {
            if (!login.matches("^[a-zA-Z0-9]+\\w*$")) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            } else if (login.length() > 20) {
                throw new WrongLoginException("Логин слишком длинный");
            } else resLogin = true;
        } catch (WrongLoginException e) {
            System.out.println(e);
        }

        try {
            if (!password.matches("^[a-zA-Z0-9]+\\w*$")) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            } else if (password.length() > 20) {
                throw new WrongPasswordException("Пароль слишком длинный");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение не совпадают");
            } else resPassword = true;
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }


        return resLogin && resPassword;
    }
}

//Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Если login не соответствует - выбросить WrongLoginException с текстом “Логин
//содержит недопустимые символы”
//3. Длина login должна быть меньше 20 символов. Если login не соответствует этим
//требованиям, необходимо выбросить WrongLoginException с текстом “Логин
//слишком длинный”
//4. Password должен содержать только латинские буквы, цифры и знак
//подчеркивания. Если password не соответствует этим требованиям, необходимо
//выбросить WrongPasswordException с текстом “Пароль содержит недопустимые
//символы”
//5. Длина password должна быть меньше 20 символов. Если password не
//соответствует этим требованиям, необходимо выбросить
//WrongPasswordException с текстом “Пароль слишком длинный”
//6. Также password и confirmPassword должны быть равны. Если password не
//соответствует этим требованиям, необходимо выбросить
//WrongPasswordException с текстом “Пароль и подтверждение не совпадают”
//7. WrongPasswordException и WrongLoginException - пользовательские классы
//исключения с двумя конструкторами – один по умолчанию, второй принимает
//сообщение исключения и передает его в конструктор класса Exception.
//8. Обработка исключений проводится внутри метода. Обработка исключений -
//вывод сообщения об ошибке консоль
//9. Метод возвращает true, если значения верны или false в другом случае
