package com.devopsexam.calcuator.service;

import java.awt.dnd.InvalidDnDOperationException;

public class CalculatorServiceImpl {

    public double doMath(double operand1,double operand2,String operation) throws InvalidDnDOperationException{
    if("/".equals(operation) && operand2==(double) 0){
        throw new InvalidDnDOperationException("Cannot divide by 0");
    }
    switch (operation){
        case "*":
            return operand1* operand2;
        case "/":
            return operand1/ operand2;
        case "+":
            return operand1+ operand2;
        case "-":
            return operand1- operand2;
        case "**":
            return Math.pow(operand1,operand2);
        case "log":
            return operand1* Math.log10(operand2);
        case "ln":
            return operand1* Math.log(operand2);
        default:
            throw new RuntimeException("Unkown operation");
    }
}
}
