package com.onion.s4.objects1;

import java.util.Scanner;

public class ObjectsMain3 {

	public static void main(String[] args) {
		
		//n명의 학생 객체 생성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력 : ");
		int count = sc.nextInt();	//2
		
		
		// 학생객체들을 담을 Student타입의 배열 생성
		Student [] stList = new Student[count];
		Student [] stList2 = new Student[count];
		
		// 밖에서 한 번만 생성시 객체는 한개 ----> 반복문으로 배열에 대입해도 각 배열의 인덱스는 동일주소값을 참조함
		// Student student = new Student();
		
		
		for(int i=0; i<stList.length; i++) {
			// Student 객체 생성
			Student student = new Student();
			
			System.out.println(i+1 + " 번째 학생의 이름 입력");
			student.name = sc.next();
			
			stList[i] = student;
			
		}
		
		for(int i=0; i<stList.length; i++) {
			System.out.println(stList[i]);
			System.out.println(stList[i].name);
			
			// Student타입의 배열만 생성했을뿐 Student객체는 생성하지 않았으므로 자동으로 기본값인 null로 정의된다
			// nullpointer 에러 발생
			//System.out.println(stList2[i].name);
			
		}
		
		
		System.out.println("Finish");
	}
}
