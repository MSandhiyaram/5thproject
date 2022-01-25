package com.binary;

public class Example2 {
							//binary operator

				//  2)Assignment Arithmetic Operators
		public static void main(String[] args)
		{

			int a = 50;
			int b = 10;

			System.out.println("+=: "+(a += b));
			
			/**
			 *  a += b 
			 *  => a = a+b
			 *  => a = 50+10
			 *  => a = 60
			 */
			
			System.out.println("-=: "+(a -= b));
			/**
			 *  a -= b 
			 *  => a = a-b
			 *  => a =60-10
			 *  => a = 50
			 */		
			System.out.println("*=: "+(a *= b));
			/**
			 *  a *= b 
			 *  => a = a*b
			 *  => a = 50*10
			 *  => a =500  
			 */	
			
			System.out.println("/=: "+(a /= b));
			/**
			 *  a /= b 
			 *  => a = a/b
			 *  => a = 500/10
			 *  => a = 50
			 */	
			System.out.println("%=: "+(a %= b));
			/**
			 *  a %= b 
			 *  => a = a%b
			 *  => a = 50%10
			 *  => a = 0
			 */	
			
			

	}

}
