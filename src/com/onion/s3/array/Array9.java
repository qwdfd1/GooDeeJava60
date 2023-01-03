package com.onion.s3.array;

public class Array9 {
	public static void main(String[] args) {
		
		int [] ar = {5,9,8,3,6};
		
		// 9,8,6,5,3
		// 3,5,6,8,9
		// 0: 1,2,3,4	95836
		// 1: 2,3,4 	98536
		// 2: 3,4 		98635
		// 3: 4			98653
		
		for(int i=0; i<ar.length; i++) {
			int [] copy = new int [ar.length]; 
			if(i==0) {
				for(int idx=0; idx<ar.length;idx++) {
					
					if(ar[i]<ar[idx+1]) {
						int temp = ar[idx+1];
						copy[i] = ar[i];
						
					
					}
				}
			}
			if(i==1) {
				
			}
			if(i==2) {
				
			}
			if(i==3) {
				
			}
			
		}
	}
}
