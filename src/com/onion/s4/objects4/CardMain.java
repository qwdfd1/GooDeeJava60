package com.onion.s4.objects4;

public class CardMain {
	public static void main(String[] args) {
		

		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);

		//static 변수 ----> 클래스변수
		//접근 방법 ----> 클래스명.변수명
		Card.size = 8;
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		
		card.info();
		card2.info();
	}
}
