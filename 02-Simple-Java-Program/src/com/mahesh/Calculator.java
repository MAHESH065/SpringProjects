package com.mahesh;

public class Calculator {
	
	public void add(int a, int b) {
		int result = a+b;
		System.out.println("Add :=" + result);
		System.out.println("Second commit......");
		System.out.println("commit......");
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
	}

}
