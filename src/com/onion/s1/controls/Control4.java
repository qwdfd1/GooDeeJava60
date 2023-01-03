package com.onion.s1.controls;

public class Control4 {
	public static void main(String[] args) {
		
		// 다중 선택
		// swtich case 
		
		int num = 3;
		switch(num) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("그 외 나머지");
			break;
		}
	}
}
