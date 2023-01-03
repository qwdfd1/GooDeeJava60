package com.onion.s2.loops;

public class LoopFor1_ex1 {
	public static void main(String[] args) {
		
		// 0 - 100 미만 사이의 짝수만 출력
		
		// if문 활용 출력방법 
		for(int i=0; i<100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("===================================");
		// if문 없이 출력방법
		for(int i=0; i<100; i+=2) {
			System.out.println(i);
		}
		System.out.println("===================================");
		
		// 0~100미만의 합계를 구하세요
		// 0+1+2+3+4+5
		// i<100 ====> 4950
		// i<=100 ====> 5050
		int sum=0;
		
		for(int i=0;i<100;i++) {
			sum+=i;
			
		}
		
		System.out.println(sum);
		
		
	
	}
}
