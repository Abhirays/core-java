package com.rays.javabasic;

public class onedimmenssion {

public static void main(String[] args, Object from) {
	int[] to = new int [8];

	System.arraycopy(from, 2, to, 0, 8);
			System.out.println("coping....");
	for (int i : to) {
		System.out.println(i);
		
	}
	
}
}
