package com.tw;

public class ArithmeticOperator {

	//Arithmetic operators 
	public static void main(String[] args) {

		int addresponse = addition(10, 10);
		System.out.println("Addition of two number " + addresponse);

		// created object
		ArithmeticOperator obj = new ArithmeticOperator();
		int subresponse = obj.substraction(20, 10);
		System.out.println("substraction of two number " + subresponse);
		
		int multiplicationresponse = multiplication(10, 10);
		System.out.println("Multiplication of two number " + multiplicationresponse);

		
		int divisionresponse = division(10, 10);
		System.out.println("Division of two number " + divisionresponse);

		
		int moduloresponse = modulo(10, 10);
		System.out.println("Modulo of two number " + moduloresponse);


	}

	// Static addition method
	public static int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	// Non static method
	public int substraction(int a, int b) {
		int c = a - b;
		return c;
	}

	// Static multiplication method
	public static int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	// Static division method
	public static int division(int a, int b) {
		int c = a / b;
		return c;
	}

	// Static modulo method
	public static int modulo(int a, int b) {
		int c = a % b;
		return c;
	}

}
