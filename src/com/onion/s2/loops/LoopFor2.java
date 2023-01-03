package com.onion.s2.loops;

public class LoopFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복분내의 보조문
		
		// 1. break;
		// 반복문내에서 break를 만나면 그 즉시 반복문을 종료함
		for(int i=0; i<10; i++) {
			if(i%4==3) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("반복문 종료");
		
		// 2. continue
		// 반복문 내에서
		// 1) for   : 그 즉시 증감식으로 이동
		// 2) while : 그 즉시 조건식으로 이동
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
