package com.onion.s4.objects3.p1;

public class Member {
	//비만관리 회원등록
	private String name;
	private int age;
	private double height;
	private double weight;
	private boolean check;



	public Member() {
		
	}
	
	public Member(String name) {

	}
	
	public Member(String name, int age) {
		
	}
	public Member(String name, int age, double height) {
		
	}
	public Member(String name, int age, double height, double weight) {
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 || age<200) {
			this.age=age;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
	
	

 }
