package com.onion.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//test목적
		//main은 어느 클래스안에 있던지 상관 없음
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일
		
		// 학생 객체 생성
		// 클래스명 변수명 = new 생성자();
		Student student = new Student();
		
		student.name = "test";
		student.num = 20;
		
		System.out.println(student);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
		// 학생 객체 생성2
		Student student2 = new Student();
		
		student2.name = "onion";
		student2.num = 30;
		
		int a = 20;
		int b = 10;
		
		a=b;
		
		//얕은 복사
		System.out.println(student==student2);
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student2.name);
		

		// 
		
		System.out.println("Finish");
	}

}
