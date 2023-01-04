package com.onion.s4.objects4;

// final 							------>	    해당 클래스는 상속하지 않는다 
public final class God {
	
	// 변수 앞 final 					------>		해당 변수는 상수처럼 사용한다. 변수명은 대문자로 쓰고
	//											다른 변수명이 겹칠 때에는 언더바(스네이크식)으로 표기한다 
//	private final String name="";
	private String name;
	
	private static God god;

	private God() {
		
	}
	
	public static God getInstance() {
		
		if(god==null) {
			god = new God();
		}
		
		return god;
		
	}	
	
	

	
	// 메서드 앞 final 				-------> 		클래스 상속시 오버라이딩 불가
	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
