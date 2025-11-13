package com.tech;

import java.util.Scanner;

public class PrimitiveToWrapper {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter an integer");
	int a=sc.nextInt();
	Integer b=Integer.valueOf(a);
	System.out.println(a);
	System.out.println(b);
	sc.close();
	

}
}
