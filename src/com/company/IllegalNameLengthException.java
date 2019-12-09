package com.company;

public class IllegalNameLengthException  extends  Exception {
    private  String name;

    public String getName() {
        return name;
    }

    public IllegalNameLengthException(String message, String name) {
        super(message);
        this.name = name;
    }
}
