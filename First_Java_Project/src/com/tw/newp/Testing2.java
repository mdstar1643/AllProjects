package com.tw.newp;

public class Testing2 {

	public static void printhi() {
		ParentClass t=new ParentClass();
		//in same package of any class we can access public,protected and default 
		//but we can't access private out the same class
		System.out.println(t.sayhipublic());
		System.out.println(t.sayhiprotected());
		System.out.println(t.sayhidefault());
	}
	
	public static void main(String[] args) {
		printhi();
	}
}
