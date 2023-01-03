package com.onion.s4.objects2;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car c1 = new Car();
		c1.info();
		
		Car c2 = new Car("Purple");
		c2.info();
				
	
	}
}
