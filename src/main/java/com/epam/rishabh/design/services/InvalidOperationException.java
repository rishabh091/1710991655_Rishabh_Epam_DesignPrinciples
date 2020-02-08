package com.epam.rishabh.design.services;

public class InvalidOperationException extends Exception {

    public InvalidOperationException(){
        super("Invalid Operation asked to perform");
    }
}
