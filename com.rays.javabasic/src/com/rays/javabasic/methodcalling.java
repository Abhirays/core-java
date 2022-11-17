package com.rays.javabasic;

public class methodcalling {
	public static void name(String[] args) {
		String[] a = {"abhishek","abhi","sharma"};
		printAll(a);
		
	}
	private static void printAll(String[] args) {
		
	
		
		for (int i = 0; i<args.length; i++) {
			System.out.println("hello"+args[i]);
			
		}
	
	
	printAll(args);
	}

		
	}
