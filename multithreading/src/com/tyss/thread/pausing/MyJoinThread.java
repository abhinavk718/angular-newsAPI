package com.tyss.thread.pausing;

public class MyJoinThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println("child thread");
			try 
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
