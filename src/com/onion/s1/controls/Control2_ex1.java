package com.onion.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 회원가입 할 때 입력한 아이디와 패스워드
		int id = 1234;
		int pw = 5678;
		
		// 키보드로 부터 아이디와 패스워드를 입력받아서 로그인 처리
		
		System.out.println("아이디를 입력해주세요");
		int inputId = sc.nextInt();
		System.out.println("패스워드를 입력해주세요");
		int inputPw = sc.nextInt();
		
		if(id == inputId) {
			if(pw == inputPw) {
				System.out.println("로그인!");
			}
			else {
				System.out.println("계정정보가 일치하지 않습니다");
			}
		}
		
		else {
			System.out.println("계정정보가 일치하지 않습니다");
		}
		

		
		
		
	}
}
