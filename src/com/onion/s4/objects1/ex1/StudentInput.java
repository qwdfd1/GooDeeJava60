package com.onion.s4.objects1.ex1;

import java.util.Scanner;

//학생 정보 입력
public class StudentInput {
	
	
	//setStudent
	//학생한명 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점, 평균 계산
	public Student[] setStudent(Student[] students) {
		Scanner sc = new Scanner(System.in);

		// 인자값으로 전달받은 배열크기보다 1 큰 배열 생성
		Student [] copy = new Student[students.length+1];
		
		//배열 복사
		for(int i=0; i<students.length; i++) {
			copy[i] = students[i];
		}
		
		
		System.out.println("학생이름을 입력해주세요");
		String name = sc.next();
		
		System.out.println("학생번호를 입력해주세요");
		int num = sc.nextInt();

		System.out.println("학생의 국어점수를 입력해주세요");
		int kor = sc.nextInt();
		System.out.println("학생의 영어점수를 입력해주세요");
		int eng = sc.nextInt();
		System.out.println("학생의 수학점수를 입력해주세요");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		
		Student newStudent = new Student();
		newStudent.setName(name);
		newStudent.setNum(num);
		newStudent.setKor(kor);
		newStudent.setEng(eng);
		newStudent.setMath(math);
		newStudent.setTotal(total);
		newStudent.setAvg(avg);
		
		//복사된 배열[기존배열길이값] = 학생객체;
		copy[students.length] = newStudent;
	
		students = copy;
		
		return students;
		
	}
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	public void setAllStudents(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			System.out.println("학생이름을 입력해주세요");
			String name = sc.next();
			
			System.out.println("학생번호를 입력해주세요");
			int num = sc.nextInt();

			System.out.println("학생의 국어점수를 입력해주세요");
			int kor = sc.nextInt();
			System.out.println("학생의 영어점수를 입력해주세요");
			int eng = sc.nextInt();
			System.out.println("학생의 수학점수를 입력해주세요");
			int math = sc.nextInt();
			System.out.println();
			
			int total = kor+eng+math;
			int avg = total/3;
			
		
			student.setName(name);
			student.setNum(num);
			student.setKor(kor);
			student.setEng(eng);
			student.setMath(math);
			student.setTotal(total);
			student.setAvg(avg);
			
			students[i] = student;
		}
	}
	
	//findStudent
	//학생배열을 받고 
	//학생의 번호를 입력받아서 일치하는 학생을 리턴
	//없으면 null 리턴
	
	public Student findStudent(Student [] students) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = null;
		
		System.out.println("찾으려는 학생의 번호를 입력해주세요");
		int num = sc.nextInt();
		
		for(int i=0; i<students.length; i++) {
			 if(num == students[i].num) {
				 student = students[i];
				
			 } 
		}
		return student;

		
		
	}
}
