package com.onion.s4.objects2;

public class OverTest {
	
	//매개변수 두개를 받아서 더한 결과를 리턴
	
	// 매개변수명은 상관x, 구성이 달라야 오버로딩 성립 
//	public void hap(int b, int a) {
//		return a*b;
//	}
	public int hap(int a, int b) {
		
		return a+b;
	}
	
	public double hap(int a, double b) {
		
		return a+b;
	}
	
	public double hap(double a, double b) {
		
		return a+b;
	}
	
	public String hap(String a, int b) {
		return a+b;
	}
}
