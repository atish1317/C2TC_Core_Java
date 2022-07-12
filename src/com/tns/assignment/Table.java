package com.tns.assignment;
//Program for multiplication

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,z;
		System.out.println("enter number");
	
		z=sc.nextInt();
		for (a=1;a<=10;a++)
			System.out.println(a*z);
			
	}

}
