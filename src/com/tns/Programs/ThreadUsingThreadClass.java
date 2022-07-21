package com.tns.Programs;


class First extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("this is Frist progrmme");
			//Thread.yield();
		}
	}
}

public class ThreadUsingThreadClass {

	public static void main(String[] args)
	{
		First t=new First();
		t.start();
		for (int i=0;i<10;i++)
			System.out.println("my 1st thread");

	}

}
