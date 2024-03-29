package com.example.logdemo;

public class TestException {
    public static void main(String[] args) {
        try {
            new Input().method();
        }catch (WrongInputException wie){
            System.out.println(wie);
        }
    }
}

class WrongInputException extends Exception{
    WrongInputException(String s){
        super(s);
    }
}

class Input{
    void method() throws WrongInputException{
        throw new WrongInputException("Wrong input");
    }
}