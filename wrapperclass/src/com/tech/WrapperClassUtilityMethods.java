package com.tech;

import java.util.Scanner;

public class WrapperClassUtilityMethods {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a ="123";
	int b=Integer.parseInt(a);
	System.out.println(b);
	double c=Double.parseDouble(a);
	System.out.println(c);
	boolean d = Boolean.parseBoolean("true");
	System.out.println(d);
	String e=Integer.toBinaryString(10);
	System.out.println(e);
	boolean f=Character.isDigit('5');
	System.out.println(f);
	char g= Character.toUpperCase('a');
	System.out.println(g);
	
	
	
	
	
	
	sc.close();
	}
}
