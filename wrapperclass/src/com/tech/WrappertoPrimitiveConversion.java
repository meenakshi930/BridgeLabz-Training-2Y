package com.tech;

import java.util.Scanner;

public class WrappertoPrimitiveConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a = 45.67;
		System.out.println("double wrapper:"+a);
		double b = Double.valueOf(a);
		System.out.println("double in primitive:"+b);
		int c = (int) b;
		System.out.println("int (primitive):"+c);
		sc.close();
		
		
		
	}

}
