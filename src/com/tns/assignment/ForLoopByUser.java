package com.tns.assignment;

import java.util.Scanner;

public class ForLoopByUser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter Number in Range");
		i = sc.nextInt();
		for(i=0;i<=100;i++)
			System.out.print(i);
	}

}
