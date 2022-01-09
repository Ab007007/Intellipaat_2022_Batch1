package com.intellipaat.javatraining.variables;

public class StudentManager {

	
	public static void main(String[] args) {
		
		Student st  = new Student();
		Student st2  = new Student();
		
		st.name = "Aravinda";
		st.collegeName = "XYZ";
		st2.name = "Harry";
		System.out.println(st.name);
		System.out.println(st.collegeName);
		System.out.println(st2.name);
		System.out.println(st2.collegeName);
		
		
		
	}
}
