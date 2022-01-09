package com.intellipaat.javatraining.methods;

public class StaticMethodsDemo {
	
	public static void main(String[] args) 
	{
		//StaticMethodsDemo mo = new StaticMethodsDemo();
		int sumoftwonumbers = sum(55, 55);
		sub(sumoftwonumbers, 50);
	
		
	}
	
	static int sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	
	
	static void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Sub of two numbers is " + c);
		
	}
	
	
}
