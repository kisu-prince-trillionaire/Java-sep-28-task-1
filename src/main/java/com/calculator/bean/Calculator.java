package com.calculator.bean;

public class Calculator {
	private int operand1;
	private int operator2;
	private String operator;
	
	public Calculator() {
	}
	
	public Calculator(int operand1, int operator2, String operator) {
		this.operand1 = operand1;
		this.operator2 = operator2;
		this.operator = operator;
	}
	
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperator2() {
		return operator2;
	}
	public void setOperator2(int operator2) {
		this.operator2 = operator2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
