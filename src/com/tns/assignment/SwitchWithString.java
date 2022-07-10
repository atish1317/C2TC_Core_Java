package com.tns.assignment;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		String que;
		System.out.println("Enter what persnol detail you want");
			que=sc.nextLine();	

				switch (que.toLowerCase()) 
				{
				case "name":
					System.out.println("Atish");
					break;
				case "age":
					System.out.println("22");
					break;
				case "adders":
					System.out.println("Chawalmandi, Achalpur");
					break;
				case "phone":
				System.out.println("7058877286");
				break;
				default:
					
					System.out.println("Data not found");
					break;}

		// TODO Auto-generated method stub

	}

}
