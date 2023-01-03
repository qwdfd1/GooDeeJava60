package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 외울 숫자 입력 : ");
		int num = sc.nextInt();
		
		//구구단 3단
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + 3*1);
		}
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
