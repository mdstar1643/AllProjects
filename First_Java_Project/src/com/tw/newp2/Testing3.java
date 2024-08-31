package com.tw.newp2;

import com.tw.newp.ParentClass;

public class Testing3 {

	public static void main(String[] args) {
		//in different package we can access only public method, variable 
		//we can't access default methods, variables
		//we can't access protected
		ParentClass t=new ParentClass();
		System.out.println(t.sayhipublic());
	}

}
