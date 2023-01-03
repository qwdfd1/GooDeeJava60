package com.onion.s3.array;

public class Array1 {
	public static void main(String[] args) {
		
		//primitive type	
		//숫자(정수형:byte, short, int, long), 실수형: float, double
		//문자 char, 논리형 boolean
		
		//reference type
		//String
		//array
		
		double d1 = 1.2;
		d1 = 5.3;
		//변수 선언 공식
		//데이터타입 변수명;
		
		if(d1 > 0) {
			int num =10;
		}
		
		//배열 선언 공식
		//모을려고하는 데이터타입 [] 변수명
		// double 타입이 아닌 double배열 타입임
		double [] ar = new double[5];
		int [] ar2 = {1,2,3};
		
		ar[0] = 3.3;
		ar[1] = 5.2;
		
		System.out.println(ar[1]);
		
		System.out.println(ar2[0]);
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
