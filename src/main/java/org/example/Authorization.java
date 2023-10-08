package org.example;
//Создать класс, в котором будет статический метод.
//Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
// – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны или false в другом случае.

public class Authorization {
    String login;
    String password;
    String confirmPassword;

    public static boolean authorization(String login, String password, String confirmPassword) {
        try {
            validLogin(login);
            validPassword(password, confirmPassword);
        } catch (WrongPasswordException | WrongLoginException e) {
            return false;
        }
        return true;
    }
//        if (validLogin(login) && validPassword(password, confirmPassword)) {
//            System.out.println("You are authorization successfully");
//        return true;
//    } else
//    return false;
//    }
    private static  boolean validLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException();
        }
        return true;
    }
     private static boolean validPassword(String password, String confirmPassword) throws WrongPasswordException {
         if (password.length() > 20 || password.contains(" ")) {
             throw new WrongPasswordException();
         } else if (password != confirmPassword) {
             throw new WrongPasswordException();
         }
         return true;
     }

     }


