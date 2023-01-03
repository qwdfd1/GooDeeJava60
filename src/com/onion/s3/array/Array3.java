package com.onion.s3.array;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		//1.학생수 입력
		//2.학생수 만큼 이름을 입력 a, b
		//3.학생수 만큼 학생의 번호, 국어, 영어, 수학 입력
		// 	a 학생의 번호 : 
		// 	a 학생의 국어 : 
		// 	a 학생의 영어 : 
		// 	a 학생의 수학 :
		// 	총점 평균 계산
		
		//모든 학생의 정보 출력
		//	이름	번호	국어	영어	수학	총점	평균
		// 	a	1	42	32	24
		//	...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 학생수 입력 : ");
		int count = sc.nextInt(); 
		String [] names = new String[count];
		int [] nums = new int[names.length];
		int [] kors = new int[names.length];
		int [] engs = new int[names.length];
		int [] maths = new int[names.length];
		int [] totals = new int[names.length];
		double [] avgs = new double[names.length];
	
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름을 입력해주세요");
			names[i] = sc.next();
			System.out.println("번호를 입력해주세요");
			nums[i] = sc.nextInt();
			System.out.println("국어 점수를 입력해주세요");
			kors[i] = sc.nextInt();
			System.out.println("영어 점수를 입력해주세요");
			engs[i] = sc.nextInt();
			System.out.println("수학 점수를 입력해주세요");
			maths[i] = sc.nextInt();
			
			totals[i] = kors[i]+engs[i]+maths[i];
			avgs[i] = totals[i]/3.0;
		}
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + "\t" + nums[i] + "\t" + kors[i] 
			+ "\t" + engs[i] + "\t" + maths[i] + "\t" + totals[i] + "\t" + avgs[i] );
		}
		
	}
}
