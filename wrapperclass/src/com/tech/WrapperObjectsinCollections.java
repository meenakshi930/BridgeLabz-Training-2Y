package com.tech;

import java.util.ArrayList;

public class WrapperObjectsinCollections {
	public static void main(String[] args) {
		double[] prices = {10.5, 20.0, 35.75, 5.5};
		ArrayList<Double> arr= new ArrayList<>();
		for(double a: prices) {
			arr.add(a);
		}
		double max = arr.get(0);
		for(double b: arr) {
			if(b>max) {
				max=b;
			}
		}
		System.out.println("highest::"+max);
		double sum =0;
		for(double b: arr) {
			sum = sum+b;
		}
		double av= sum/arr.size();
		System.out.println("average::"+av);
		
		
		
		
	}

	
}
