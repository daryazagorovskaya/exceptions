package org.example;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        if (Authorization.authorization("375447651234","security3", "security3")){
        System.out.println("Success");
        } else{
            System.out.println("Error");

        }

    }
}