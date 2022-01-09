package com.intellipaat.javatraining.inheritance;

public class Car extends Vehicle implements PetrolEngine, DesielEngine
{
	private String varient;
	private String brand;

		@Override
		public void cc(int a) {
			System.out.println("Car has " +  a + " cc Engine");
		}
		
		@Override
		public void fuel(String fueltype) {
			System.out.println("Fual used by car " + fueltype);
			
		}
	public void printCarDetails()
	{
		System.out.println("Car Details :");
		//printValues();
		System.out.println(" Brand " + brand );
		System.out.println(" Manufacturing Year " + manufacturingYear);
		System.out.println(" Color  " + color);
		System.out.println(" Engine Number  " + engineNum);
		System.out.println(" Varient " + varient );
		
				
	}
	
	
	
	public static void main(String[] args) {
		
		Car kia = new Car();
		Car innova = new Car();
		
		kia.brand = "KIA";
		kia.color = "Perl White";
		kia.engineNum = "EDSDFS123123123sasda";
		kia.varient = "celtos";
		kia.manufacturingYear = "2022";
		kia.fuel("Pertrol");
		kia.cc(1500);
		
		innova.brand = "TYOTA";
		innova.color = "Perl White";
		innova.engineNum = "ASDFAFA123123DFSDF";
		innova.varient = "VXi+";
		innova.manufacturingYear = "2022";
		innova.fuel("Pertrol");
		innova.cc(2400);
		kia.printCarDetails();
		innova.printCarDetails();
		
		
		
	}
}
