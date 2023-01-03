package com.onion.s4.objects2;

import java.util.Random;

public class ReturnTest {
	
	public void t1() {
		System.out.println("return이 없을 때는 void");
	}
	
	public int t2() {
		Random random = new Random();
		System.out.println("return은 int");
		return random.nextInt(50);
	}
	
	public int [] t3() {
		
		int [] ar = new int[5];
		Random random = new Random();
		for(int i=0; i<ar.length; i++) {
			ar[i] = random.nextInt(42);
		}
		return ar;
		
	}
}
