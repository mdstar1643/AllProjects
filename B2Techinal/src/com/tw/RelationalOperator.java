package com.tw;

public class RelationalOperator {

	// Relational operators:
	/**
	 * 1:(==); 2:(!=); 3:(>); 4:(<); 5:(>=); 6:(<=);
	 **/
	public static void main(String[] args) {

		// == Operator
		int a = 10;
		int b = 10;

		boolean val = (a == b);
		System.out.println(val);

		if (a == b) {
			System.out.println("both value are equal");
		} else {
			System.out.println("both value are not equal");
		}

		// != operator

		if (a != b) {
			System.out.println("both value are not equal");
		} else {
			System.out.println("you are wrong they are equal");
		}

		relationaloperator();
	}

	public static void relationaloperator() {
		int age = 20;

		if (age > 20) {
			System.out.println("you are elegible for movie!");
		} else {
			System.out.println("you are not elegible for this movie!");
		}

		if (age >= 20) {
			System.out.println("you are elegible for movie!");
		} else {
			System.out.println("you are not elegible for this movie!");
		}

		// ***************************************************//

		if (age < 20) {

			System.out.println("you are not elegible for this movie!");
		} else {
			System.out.println("you are elegible for movie!");
		}

		if (age <= 20) {

			System.out.println("you are not elegible for this movie!");
		} else {
			System.out.println("you are elegible for movie!");
		}
	}
}
