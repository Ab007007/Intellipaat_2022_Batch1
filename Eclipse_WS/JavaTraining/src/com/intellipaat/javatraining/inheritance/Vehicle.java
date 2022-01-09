package com.intellipaat.javatraining.inheritance;

public abstract class Vehicle 
{
	public String manufacturingYear;
	public String color;
	public String engineNum;
	
	
	public void printValues()
	{
		System.out.println(" Manufacturing Year " + manufacturingYear);
		System.out.println(" Color  " + color);
		System.out.println(" Engine Number  " + engineNum);
	}

}
