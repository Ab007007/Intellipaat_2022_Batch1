package com.intellipaat.javatraining.constructor;

class Person
{
	String name;
	int age;
	
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	Person() {
		
	}
}

public class PersonManager {

	public static void main(String[] args) {
		Person p1 = new Person("ABH",33);
		Person p2 = new Person("KLH",35);
		Person p3 = new Person();

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
