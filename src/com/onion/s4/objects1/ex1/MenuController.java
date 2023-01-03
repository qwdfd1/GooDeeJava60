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
		
		while(run) {
			System.out.println("1. 학생 정보 입력 2. 학생 찾기 3. 학생 전체 정보 4. 학생 추가 출력 5. 종료");
			
			int action = sc.nextInt();
			
			if(action == 1) {
				System.out.println("학생 등록");
				si.setAllStudents(students);
			}
			else if(action == 2) {
				System.out.println("학생 찾기");
				Student student = si.findStudent(students); 
				if(student != null) {
					sv.viewOne(student);
				}
				else {
					System.out.println("일치하는 학생의 정보가 없습니다.");
				}
				
			}
			else if(action == 3) {
				System.out.println("학생 정보");
				sv.viewList(students);
			}
			else if(action == 4) {
				students = si.setStudent(students);
				System.out.println("추가되었습니다.");
			}
			else if(action == 5) {
				run = false;
				fin();
			}			
			else {
				System.out.println("잘못된 접근입니다");
			}

		}
	}
	

	
	public void fin() {
		System.out.println("종료");
	}
	
}
