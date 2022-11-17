package com.rays.javabasic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date1 {
public static void main(String[] args) throws ParseException {
	String s = "06/07/20002";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	Date d = sdf.parse(s);
	System.out.println(d);
			
	
	
     }
}
   