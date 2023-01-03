package com.onion.s3.array;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		
		
		//1. 데이터추가
				//무조건 0번 인덱스에 추가
		
		//2. 데이터삭제
				//무조건 0번 인덱스 삭제
		
		//3. 종료

		Scanner sc = new Scanner(System.in);
		int [] ar = {5,1,4};
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 종료");
			int action = sc.nextInt();
			
			
			//데이터 추가
			if(action == 1) {
				System.out.println("첫번째에 입력하고 싶은 숫자 : ");
				int input = sc.nextInt();
				
				// 기존 배열크기에 1만큼 더한 임시배열 선언
				int [] copy = new int[ar.length+1];

				// 임시배열 0번 인덱스에 추가할 숫자 대입
				copy[0] = input;
				
				// 배열 크기만큼 반복문 진행
				// 기존 배열 인덱스 i-1의 값을 임시배열 i에게 대입
				for(int i=1; i<copy.length; i++) {
					copy[i] = ar[i-1];
				}
				
				// 임시배열의 주소값 복사
				ar = copy;
				
				// 숫자 추가된 배열 출력
				for(int i=0; i<ar.length; i++) {
					System.out.println(ar[i]);
				}
				System.out.println("추가된 숫자 : " + input);
				System.out.println("데이터 추가 완료!");
			}
			
			//데이터 삭제
			else if(action == 2) {
				// 기존 배열 크기의 -1크기의 임시 배열 선언
				int [] copy = new int[ar.length-1];
				// 인덱스 변수 초기화
				int idx = 0;
				int num = 0;
				
				// 기존배열
				for(int i=0; i<ar.length; i++) {
					if(i == 0) {
						num = ar[i];
						continue;
					}
					copy[idx] = ar[i];
					idx++;
				}
				
				//2번째 방법
//				for(int i=0; i<copy.length; i++) {
//					copy[i] = ar[i+1];
//				}
				
				ar = copy;
				
				for(int i=0; i<ar.length; i++) {
					System.out.println(ar[i]);
				}
				System.out.println("삭제된 숫자 : " + num);
				System.out.println("데이터 삭제 완료!");

			}
			
			//종료
			else if(action == 3) {
				run = false;
				System.out.println("종료합니다...");
			}
			
			//잘못 선택했을때
			else {
				System.out.println("잘못된 접근입니다");
			}
		}
		
		
		
	
	}
}
