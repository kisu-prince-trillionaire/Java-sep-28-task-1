package com.calculator.dao;

import java.util.Scanner;

import com.calculator.bean.Calculator;

public class CalculatorDao {

//	public void getInfo() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an operator (+, -, *, /): ");
//		String s = sc.next();
//		Calculator.setOperator(s);
//
//		System.out.println("Enter two numbers below for the operation");
//		System.out.println("Enter number 1 : ");
//		num1 = sc.nextDouble();
//		System.out.println("Enter number 2 : ");
//		num2 = sc.nextDouble();
//
//	}
	
	public int addition (int num1,int num2) {
        int sum = num1+num2;
        return sum;
    }
    
    public double addition (double num1,double num2) {
        double sum = num1+num2;
        return sum;
    }
    
    public String addition(String string1, String string2) {
        String sum = string1 + string2;
        return sum;
    }
    
    public double division(double num1, double num2) {
        double result = num1/num2;
        return result;
    }
    
    public int substraction(int num1, int num2) {
        int result = num1-num2;
        return result;
    }
    
    public int multiplication(int num1, int num2) {
        int result = num1*num2;
        return result;
    }
}
