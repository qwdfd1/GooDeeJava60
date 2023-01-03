package com.onion.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 회원가입 할 때 입력한 아이디와 패스워드
			int id = 1234;
			int pw = 5678;
			boolean login = false;
			
			// 키보드로 부터 아이디와 패스워드를 입력받아서 로그인 처리
			
			System.out.println("아이디를 입력해주세요");
			int inputId = sc.nextInt();
			System.out.println("패스워드를 입력해주세요");
			int inputPw = sc.nextInt();
			
			if(id == inputId) {
				if(pw == inputPw) {
					System.out.println("로그인!");
					login = true;
				}
				else {
					System.out.println("계정정보가 일치하지 않습니다");
					return;
				}
			}
			
			else {
				System.out.println("계정정보가 일치하지 않습니다");
				return;
			}
			
			//로그인이 성공 했을 때만 실행
			//급여를 입력
			//정규직이면 1을, 계약직이면 2를 입력
			//실급여 계산
			//정규직 : 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
			//계약직 : 원천징수 3.3%
			//실급여 출력
			
			// 로그인에 성공 했을 때
			if(login) {
				System.out.println("실수령액 계산기");
				
				// 급여 입력
				System.out.println("급여를 입력해주세요");
				int pay = sc.nextInt();
				
				// 근로유형 선택
				System.out.println("정규직이면 1, 계약직이면 2를 입력해주세요");
				int emp = sc.nextInt();
				
				// 4대보험비와 실수령액 변수 선언
				int tax = 0;
				int result = 0;
				
				// 정규직 급여계산
				// 급여에서 총 7%를 뺀 금액이 실 수령액
				
				
				if(emp == 1) {
					// 고용보험
					//int tax1 = (int)(pay*0.02);
					tax += (int)(pay*0.02);
					
					// 산재보험
					//int tax2 = (int)(pay*0.03);
					tax += (int)(pay*0.03);
					
					// 의료보험
					//int tax3 = (int)(pay*0.01);
					tax += (int)(pay*0.01);
					
					// ??보험
					//int tax4 = (int)(pay*0.01);
					tax += (int)(pay*0.01);
					
					// 급여에서 4대보험비를 제한 실수령액
					//result = pay - (tax1+tax2+tax3+tax4);
					result = pay-tax;

				}
				else {
					// 계약직 급여계산
					// 급여에서 원천징수 3.3%를 제한 실수령액
					tax = (int)(pay*0.033);
					result = pay-tax;
					
				}
				
				System.out.println("실 수령액 : " + (int)result);
			}
			else {
				System.out.println("로그인 한 사용자만 이용 가능합니다.");
			}

		}
		
		
		
		
	}

}
