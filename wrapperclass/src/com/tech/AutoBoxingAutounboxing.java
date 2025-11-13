package com.tech;

import java.util.ArrayList;

public class AutoBoxingAutounboxing {
	public static void main(String[] args) {
		int sum =0;
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		for(Integer i : arr) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
	}

}
