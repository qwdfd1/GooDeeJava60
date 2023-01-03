package com.onion.s4.objects1.ex1;

import java.util.Scanner;


public class MenuController {
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public  void start() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		 
		
		
		System.out.println("학생수를 입력하세요  : ");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		//종료버튼을 누를때까지 반복실행
		while(run) {
			System.out.println("1. 학생 정보 입력 2. 학생 찾기 3. 학생 전체 정보 4. 학생 추가 출력 5. 종료");
			
			int action = sc.nextInt();
			
			//학생 정보 입력
			if(action == 1) {
				System.out.println("학생 등록");
				si.setAllStudents(students);
			}
			
			// 학생 찾기
			else if(action == 2) {
				System.out.println("학생 찾기");
				Student student = si.findStudent(students); 
				if(student != null) {
					sv.view(student);
				}
				else {
					System.out.println("일치하는 학생의 정보가 없습니다.");
				}
				
			}
			// 학생 전체 정보
			else if(action == 3) {
				System.out.println("학생 정보");
				sv.view(students);
			}
			// 학생 추가
			else if(action == 4) {
				students = si.setStudent(students);
				System.out.println("추가되었습니다.");
			}
			// 프로그램 종료
			else if(action == 5) {
				run = false;
				fin();
			}
			//잘못 눌렀을 때
			else {
				System.out.println("잘못된 접근입니다");
			}

		}
	}
	

	
	public void fin() {
		System.out.println("종료");
	}
	
}
