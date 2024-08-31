package com.wt;

public class baterflyStar {

	private static int m;

	public static void main(String[] args) {

		
		int n = 5;
		
		//uper half
		
		for(int i = 1; i<=n; i++) {
		
		//1st part 
		
		   for(int j = 1; j<=i; j++) 
			   
			   System.out.print("*");
		
	    	}
		   
		   //spaces
		   
		   int spaces = 2 * (n-m);
		   
		   for(int j = 1; j<=spaces; j++) {
			   
			   System.out.print(" ");
		   }
		   
		   //2st part
		   
		   for(int j = 1; j<=n; j++) {
			   System.out.print("*");
		   }
		   
		   System.out.println();
		   
		   //lower half
		   
			for(int i=n; i>=1; i--) {
				
				//1st part 
				
				   for(int j = 1; j<=i; j++) {
					   
					   System.out.print("*");
				
			    	}
				   
				   //spaces
				   
				   int spaces1 = 2 * (n-i);
				   
				   for(int j = 1; j<=spaces; j++) {
					   
					   System.out.print(" ");
				   }
				   
				   //2st part
				   
				   for(int j = 1; j<=i; j++) {
					   System.out.print("*");
				   }
				   
				   System.out.println();
				   
		   
		   
		   
		   
		
	   	}
		
	}	
		
	}

  
