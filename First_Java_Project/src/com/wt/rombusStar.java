package com.wt;

public class rombusStar {

	public static void main(String[] args) {

		
		int n = 5;
		
		for(int i = 1; i<n; i++) {
			//space
			
			for(int j = 1; j<n-1; j++) {
			System.out.print(" ");
			
			}
			//star
			
			for(int j = 1; j<5; j++) {
				
				System.out.print("#");
			}
			
			System.out.println();
			
		}
		
		
	}

}
