package com.onion.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		//로그인 시도 총 5번 시도 가능
		
		//반복문 종료 후
		//로그인이 성공했으면 "환영합니다" 출력
		//로그인이 실패했으면 "은행을 방문하세요" 출력
		
		for(int i=0; i<5; i++) {
			
			//id,pw 입력받음
			System.out.println("아이디를 입력해주세요");
			int yid = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요");
			int ypw = sc.nextInt();
			
			// id와 입력받은 id가 일치할 때
			if(yid==id && ypw==pw) {
				i = 4;
				check = true;
			}
			
			// 계정정보가 일치하지 않을 때
			else {
				System.out.println("계정정보가 일치하지 않습니다.");
				System.out.println("다시 시도 해주세요");
			}
		}
		
		if(check) {
			System.out.println("환영합니다");
		}
		else {
			System.out.println("은행을 방문하세요");
		}
	}
}
