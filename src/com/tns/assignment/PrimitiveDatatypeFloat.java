package com.tns.assignment;

import java.util.Scanner;

public class PrimitiveDatatypeFloat {

	public static void main(String[] args) 
	{
		Scanner adarsh = new Scanner (System.in);
		int m ;
		float n ;
		double o ;
		System.out.println("enter value of m");
		m = adarsh.nextInt();
		System.out.println("enter value of n");
		n = adarsh.nextFloat();
		o=m+n;
		System.out.println("result is "+o);
	}

}
