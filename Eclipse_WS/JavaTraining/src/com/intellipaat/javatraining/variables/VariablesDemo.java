package com.intellipaat.javatraining.variables;

public class VariablesDemo 
{
	static String name ;
	final static String country = "India";
	public static void main(String[] args) 
	{
		name = "Aravinda";
		int age = 55;
		double height = 5.8;
		char grade = 'A';
		
		System.out.println(name);
		test();
	}
	
	public static void test()
	{
		System.out.println(name);
		//country = "USA";
		System.out.println(country);
	}

}
