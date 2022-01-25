package com.Unaryoperator;

public class Example1 {

	public static void main(String[] args) 
	{
	
		int a = 20;
		//final int b = 60;

		/*
		 * The final local variable a cannot be assigned. 
		 * It must be blank and not using a compound assignment
		 */
		int task = a++;
		//int task2 = ++b; 
		
		System.out.println(task);
		//System.out.println(task2);		

		
		
	}

}
