package com.tw2;

public class SwitchTesting1 {

	public static void main(String[] args) {
		
		m2 (20);
		

	}
	
	public static void m2 (int a) {
		switch (a) {
		case 10 :
			System.out.println("10 value is" + a );
			break;
		case 20 :
			System.out.println("20 value is" + a );
			break;
			
		case 30 :
			System.out.println("30 value is" + a );
			break;
			
		case 40 :
			System.out.println("40 value is" + a );
			break;
		case 50 :
			System.out.println("50 value is" + a );
			break;
			default :
				System.out.println("Please Enter a corect value" + a);
				break;
			
		}
	}

}
