package com.facebook.www;

public class Staticvar {

	static int y = 85; // static variable
	static int x = 75; // static variable

	public static void main(String[] args) {
		Staticvar obj = new Staticvar();
		System.out.println(y); // direct calling static variable
		System.out.println(obj.x); // calling by using object reference
		System.out.println(Staticvar.x); // calling bu using class reference
	}

}
