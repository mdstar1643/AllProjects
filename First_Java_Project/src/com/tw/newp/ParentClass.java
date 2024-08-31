package com.tw.newp;

public class ParentClass {

	public static void main(String[] args) {
		ParentClass obj=new  ParentClass();
		String res=obj.sayhi();
		System.out.println(res);
	}
	
	private String sayhi() {
		return "hi";
	}
	
	public String sayhipublic() {
		return "hi";
	}
	
	protected String sayhiprotected() {
		return "hi";
	}
	
	 String sayhidefault() {
		return "hi";
	}
}
