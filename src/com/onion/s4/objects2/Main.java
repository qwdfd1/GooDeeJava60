package com.onion.s4.objects2;

public class Main {
	
	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		
		int n = returnTest.t2();
		
//		System.out.println(n);
		
		int [] ar = returnTest.t3();
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+"\t");
		}
	}
}
