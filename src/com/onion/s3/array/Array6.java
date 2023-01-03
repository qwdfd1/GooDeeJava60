package com.onion.s3.array;

public class Array6 {
	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		
		int [] copy = new int[ar1.length-1];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = ar1[i];
			System.out.println(copy[i]);
		}
		
		ar1 = copy;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		
		
	}
}
