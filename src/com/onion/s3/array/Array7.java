package com.onion.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar = {8,5,13,9,6};
		int [] copy1 = new int[ar.length-1];
		//키보드로 부터 삭제하고 싶은 값을 입력 받음

		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 숫자 입력");
		int del = sc.nextInt();
		int idx=0;
		int num=0;
		
		for(int i=0; i<ar.length; i++) {
	
			if(del==ar[i]) {
				num = ar[i];
				continue;
			}
			
			copy1[idx]=ar[i];
			idx++;
		}
		
		ar = copy1;
		
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("삭제된 숫자 : " + num);
	



	}

}
