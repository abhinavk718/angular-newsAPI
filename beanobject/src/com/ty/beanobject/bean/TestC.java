package com.ty.beanobject.bean;

import java.util.Scanner;

public class TestC
{
	public static void main(String[] args) 
	{
		System.out.println("Scanner class");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Name is "+name);
		
		System.out.println("Enter address");
		String address=sc.nextLine();
		System.out.println("Address is "+address);
	}
}
