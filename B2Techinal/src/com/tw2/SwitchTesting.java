package com.tw2;

public class SwitchTesting {

	public static void main(String[] args) {
		
		 m2(30);
	}
	
	public static void m2(int a) {
		switch (50) {
		case 10 :
			System.out.println("10 value is" + a);
			break;
		case 20 :
			System.out.println("20 value is" + a);
			break;
		case 30 :
			System.out.println("30 value is" + a);
			break;
		case 40 :
			System.out.println("40 value is " + a);
			break;
			
			default :
				System.out.println("Any value" + a); 
				break;
			
	    }
   	}

}
