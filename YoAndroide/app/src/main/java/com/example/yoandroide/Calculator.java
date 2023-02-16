package com.example.yoandroide;

public class Calculator {

    private boolean firstOperandComplete;
    private int firstOperand;
    private int secondOperand;

    private int result;

    private Operator operator;

    public Calculator(){
        firstOperandComplete = false;
        firstOperand = 0;
        secondOperand = 0;
        result = 0;
    }

    public String getFirstOperand() {
        return Integer.toString(firstOperand);
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public String getSecondOperand() {
        return Integer.toString(secondOperand);
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    @Override
    public String toString() {
        return Integer.toString(result);
    }

    public void sum() {
        operator = new Sum();
    }

    public void sub() {
        operator = new Sub();
    }

    public void mul() {
        operator = new Mul();
    }

    public void div() {
        operator = new Div();
    }

    public void calculate(int a, int b) {
        result = operator.doOperation(a, b);
        operator = null;
    }

    public void reset() {
        firstOperandComplete = false;
        firstOperand = 0;
        secondOperand = 0;
        result = 0;
    }
}
