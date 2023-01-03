package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor1 {
	public static void main(String[] args) {
		System.out.println("START");
		
		// 반복문
		// 초기식에서 선언한 변수를 조건식에 대입 true면 반복문 진행
		// false면 반복문 탈출

		// for문 초기식이 아닌 다른곳에 선언된 변수가 있을경우 초기식은 생략할 수 있다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문의 횟수를 입력하세요");
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			System.out.println("Hello World");
			System.out.println("Good Bye");
			System.out.println(i);
		}
		
		
		
			
		System.out.println("FINISH");
	}
}
