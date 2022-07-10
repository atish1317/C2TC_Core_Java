
package com.tns.assignment;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Arithmetic Operators using user input
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		a=input.nextInt();
		System.out.println("Enter number");
		b=input.nextInt();
		System.out.println(a+b);
		System.out.println(--a);
		System.out.println(++b);

	}

}
