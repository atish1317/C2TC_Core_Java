package com.tns.assignment;

public class TryAndCatchBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println(5);
			System.out.println(6/0);
			System.out.println(7);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	

	}

}
