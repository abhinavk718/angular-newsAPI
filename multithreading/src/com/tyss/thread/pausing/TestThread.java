package com.tyss.thread.pausing;

public class TestThread 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		MyThread mt=new MyThread();
		mt.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main thread");	
//			Thread.yield();
		}
		System.out.println("main ended");
	}
}
