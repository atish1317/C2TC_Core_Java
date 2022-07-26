package com.tns.Programs;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Atish");
		al.add("Adarsh");
		al.add("abc");
		al.add(70588772);
		
		al.remove(2);
		System.out.print(al);
	}

}
