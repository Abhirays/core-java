package com.rays.javabasic;

public class array {
	public static void main(String[] args) {
	
	int[] a = {15,97,14,77,65};
	int i;
	for( i = 0; i< a.length; i++) {
		if ( a[i] % 7 ==0) { 
			System.out.println("completely divisible");
			
	}
	else {
		int c = a[i] % 7;	
		System.out.println("rimender ="+ c);
	}
	}
	}
}