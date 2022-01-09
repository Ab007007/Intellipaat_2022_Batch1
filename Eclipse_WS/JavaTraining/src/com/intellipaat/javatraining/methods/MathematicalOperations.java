package com.intellipaat.javatraining.methods;

public class MathematicalOperations {
	
	public static void main(String[] args) 
	{
		MathematicalOperations mo = new MathematicalOperations();
		mo.sum(55, 55);
		mo.sub(55, 22);
		mo.mul(25, 25);
		mo.div(50, 25);
		
		
	}
	
	void sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
		
	}
	
	
	void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Sub of two numbers is " + c);
		
	}
	
	void mul(int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication of two numbers is " + c);
		
	}
	
	void div(int a, int b)
	{
		int c = a / b;
		System.out.println("Division of two numbers is " + c);
		
	}
	
}
