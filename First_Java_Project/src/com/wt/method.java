package com.wt;

public class method {
	
	public static void printjava() {
		System.out.println("hello Java");
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void printSum(int a, int b) {
		
		int sum = a + b;
		
		System.out.println(sum);
	}
	
	public static int add(int a, int b) {
		
		return a + b;
	}
	
	public static int subtract(int c, int d) {
		
		return c - d;
		
	}
	

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add( num1, num2 );
		
		System.out.println(sum);
		
		int num3 = 30;
		int num4 = 40;
		int sum1 = subtract(num3, num4);
		
		System.out.println(sum1);
		
	}
	
        																

}
