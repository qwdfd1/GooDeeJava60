package com.onion.s4.objects4;

public class GodMain {
	public static void main(String[] args) {
		
		//singleTon 디자인 패턴
		//객체가 하나만 생성되도록 유도하는 패턴
		
		God god = God.getInstance();
		god.setName("석주신");
		
		System.out.println("God : "  + god);
		System.out.println("God : "  + god.getName());
		
		god = God.getInstance();
		
		System.out.println("God : "  + god);
		System.out.println("God : "  + god.getName());
		
	}
}
