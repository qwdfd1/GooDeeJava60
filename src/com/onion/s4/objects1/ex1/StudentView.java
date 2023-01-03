package com.onion.s4.objects1.ex1;

import java.util.Scanner;

//학생 정보 출력
public class StudentView {
	
	
	//viewOne 
	//학생 한 명을 받아서 학생의 모든 정보를 출력
	
	public void viewOne(Student student) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.print(student.getName() + "\t");
		System.out.print(student.getNum()  + "\t");
		System.out.print(student.getKor() + "\t");
		System.out.print(+ student.getEng()+ "\t");
		System.out.print(student.getMath()  + "\t");
		System.out.print(student.getTotal()  + "\t");
		System.out.println(student.getAvg() + "\t");
		
	}
	
	//viewList
	//학생 배열을 받아서 각 항목을 출력
	public void viewList(Student [] students) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i].getName() + "\t");
			System.out.print(students[i].getNum() + "\t");
			System.out.print(students[i].getKor() + "\t");
			System.out.print(students[i].getEng() + "\t");
			System.out.print(students[i].getMath() + "\t");
			System.out.print(students[i].getTotal() + "\t");
			System.out.println(students[i].getAvg() + "\t");
		}
	}
	


	
}
