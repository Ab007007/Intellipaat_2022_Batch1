package com.intellipaat.javatraining.methods;

public class MethodWithReturnType {
	
	public static void main(String[] args) 
	{
		MethodWithReturnType mo = new MethodWithReturnType();
		int sumoftwonumbers = mo.sum(55, 55);
		mo.sub(sumoftwonumbers, 50);
	
		
	}
	
	int sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	
	
	void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Sub of two numbers is " + c);
		
	}
	
	
	
}
