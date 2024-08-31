package com.tw.newp2;

import com.tw.newp.ParentClass;

public class Testing4 extends ParentClass{

	public static void main(String[] args) {
		Testing4 obj=new Testing4();
		System.out.println(obj.sayhiprotected());
		System.out.println(obj.sayhipublic());
	}
}
