package com.rays.javabasic;

public class divsible { 
	public static void main(String[] args) {
		int num = 30;
		int a = 5;
		int b = 3;
		
		if( (num % 5 == 0) && (num % 3 == 0)) {
			System.out.println( "divisible by both" );
		}
		else  if (num % 3 ==0) { 
				System.out.println("divisible by 3");
			}
				else if ( num % 5 == 0) {
					System.out.println( "b is divisible by 5");
				}
			
			
	}
}
