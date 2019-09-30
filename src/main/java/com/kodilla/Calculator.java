package com.kodilla;

public class Calculator {


    public double addAtoB(double a, double b){
        return a + b;
    }
    public double subtractBfromA(double a, double b){
        return a - b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addAtoB(12.5, 3));
    }
}
