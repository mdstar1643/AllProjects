package com.tw2;

public class PersonCategorizer {

	public static void main(String[] args) {
		
		PersonCategorizer("Educator");

		 
	}
	
	public static void PersonCategorizer(String role) {
		
		switch (role.toUpperCase()) {
		case "docter" :
			System.out.println("Healthcare Professional");
			break;
		case "teacher" :
			System.out.println("Educator");
			break;
		case "engeneer" :
			System.out.println("Technical Specialist");
		case "artist" :
			System.out.println("Creative Professional");
			break;
		case "chef" :
			System.out.println("Culinary Expert");
			break;
			default :
				System.out.println("Unknown Role");
				break;
				
		}
	}

}