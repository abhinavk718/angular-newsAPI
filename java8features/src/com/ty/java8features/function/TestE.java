package com.ty.java8features.function;

import java.util.function.Supplier;

public class TestE
{
	public static void main(String[] args)
	{
		Supplier<Student> s = () ->new Student(2,"vijay", 56.6);
		Student s1=s.get();
		System.out.println("Name is "+s1.name);
		System.out.println("Id is "+s1.id);
		System.out.println("Percentage is "+s1.percentage);
		
		
		Supplier<Integer> i = () -> 20;
		int val=i.get();
		System.out.println("Value is "+val);
		
		Supplier<String> st = () -> "Good Eveninbg";
		String str=st.get();
		System.out.println("Value is "+str);
				
	}
}
