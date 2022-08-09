package com.tns.weekendexercise;

public class fibonacciSeries {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		int a=10,b=11;
		System.out.println(a+" "+b);
		int c;
		
			for(int i=1;i<=10;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
				
			}
				
		

	}

}
