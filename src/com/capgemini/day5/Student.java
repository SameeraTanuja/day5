package com.capgemini.day5;

import java.util.Scanner;

public class Student {
	private long rollNumber;
	private int age;
	private String name;
	private String course;
	public Student(long rollNumber, int age, String name, String course) {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
		this.course = course;
	}
	
	public static void main(String args[]) throws AgeNotWithinRangeException,NameNotValidException
	{
		try(Scanner sc=new Scanner(System.in)){;
		age=sc.nextLong();
		name=sc.nextLine();
		
		if((age>15)&&(age<21))
		{
			throw new AgeNotWithinRangeException()
		}
		
		
	}

}

