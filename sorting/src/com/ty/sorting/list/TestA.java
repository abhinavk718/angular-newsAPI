package com.ty.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA
{
	public static void main(String[] args)
	{
		ArrayList<Student>al=new ArrayList<>();
		Student s1=new Student(12, "dimple", 35.6);
		Student s2=new Student(2, "sweety", 30.6);
		Student s3=new Student(34, "jimmy", 68.9);
		Student s4=new Student(5, "tummy", 76.5);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);	
		System.out.println("Before sorting ");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After sorting");
		displayStudentDetails(al);
		
	}
	static void displayStudentDetails(ArrayList<Student>al)
	{
		Iterator<Student> it=al.iterator();
		while (it.hasNext()) 
		{
			Student s=it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);	
			System.out.println("---------------------------------");
		}
	}
}
