package com.tns.assignment;

import java.util.Scanner;

public class DecesionMaking {

	public static void main(String[] args) 
	{
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your Age");
		age=input.nextInt();
		if (age>=18)
		{
			System.out.println("Your Eligible To Watch Movie");
		}
		else
		{
			System.out.println("Your Are Not Eligible To Watch Movie");
		}

	}

}