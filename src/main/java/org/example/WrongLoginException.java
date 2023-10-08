package org.example;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String message) {
        super(message);
        

    }
    // Метод getMessage() возвращает сообщение об исключении
    public WrongLoginException(Exception e) {

    }

    public WrongLoginException() {

    }
}
