package com.epam.rishabh.design.services;

import org.springframework.stereotype.Service;

@Service
public class DoOperation {

    public float operationDone(float digit1,float digit2,String operand) throws InvalidOperationException{
        if(operand.toLowerCase().equals("add"))
            return addition(digit1,digit2);
        else if(operand.toLowerCase().equals("subtract"))
            return subtraction(digit1,digit2);
        else if(operand.toLowerCase().equals("multiply"))
            return multiply(digit1,digit2);
        else if(operand.toLowerCase().equals("divide"))
            return divide(digit1,digit2);
        else
            throw new InvalidOperationException();
    }

    private float addition(float digit1,float digit2){
        return digit1+digit2;
    }
    private float subtraction(float digit1,float digit2){
        return digit1-digit2;
    }
    private float multiply(float digit1,float digit2){
        return digit1*digit2;
    }
    private float divide(float digit1,float digit2){
        return digit1/digit2;
    }

}
