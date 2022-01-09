package com.intellipaat.javatraining.methods;

public class OverloadingDemo {
	
	public static void main(String[] args) 
	{
		OverloadingDemo mo = new OverloadingDemo();
		mo.sum(55, 55);
		mo.sum(55.55, 44.44);
		mo.sum(55.55,10);
		mo.sum("Aravinda", " HB");
		
	}
	
	void sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum of two numbers " + a +  " and " + b +  " is " + c);
			
	}
	
	void sum(double a, double b)
	{
		double c = a + b;
		System.out.println("Sum of two numbers " + a +  " and " + b +  " is " + c);
		
	}
	
	void sum(String a, String b)
	{
		String c = a + b;
		System.out.println("Sum of two numbers " + a +  " and " + b +  " is " + c);
		
	}
	
	
	
}
