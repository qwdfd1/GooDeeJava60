package com.onion.s3.array;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		int [] ar = new int[3];
		
		//키보드로 부터 숫자를 입력 받아서 해당 숫자 만큼 배열을 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 배열 크기를 입력해주세요");
		int num = sc.nextInt();
		int [] ar2 = new int[num];
		
		//키보드로 부터 배열에 넣을 값을 입력 받음
		for(int i=0; i<ar2.length; i++) {
			System.out.println("배열에 넣을 값을 입력해주세요");
			ar2[i] = sc.nextInt();
		}
		
		//배열 내의 데이터 출력
		for(int i=0; i<ar2.length; i++) {
			System.out.println(ar2[i]);
			
		}
		 
	}

	
	
	
	
}
