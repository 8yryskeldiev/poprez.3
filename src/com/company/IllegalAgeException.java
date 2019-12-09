package com.company;

public class IllegalAgeException extends  RuntimeException {

    public IllegalAgeException(String message, int age) {
        super(message);

    }
}
