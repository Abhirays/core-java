package com.rays.javabasic;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class dateclass {
	
public static void main(String[] args) {
	
	Date d = new Date(0);
	
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	
	String s = sdf.format(d);
	
      	System.out.println(s);
	
	
	
	
    }}