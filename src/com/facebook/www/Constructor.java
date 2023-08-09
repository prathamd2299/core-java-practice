package com.facebook.www;

public class Constructor {
	Constructor() {
		System.out.println("I am constructor");
	}

//	Constructor() duplication constructor signature is not allowed
//	{
//	}

	Constructor(int x) {
		System.out.println("I am " + x);
	}

	Constructor(double x) {
		System.out.println("I am " + x);
	}

	public static void main(String[] args) {
		/*
		 * Constructor obj = new Constructor(); Constructor obj1 = new Constructor(5);
		 * Constructor obj2 = new Constructor(15); Constructor obj3 = new
		 * Constructor(15.23);
		 */

		new Constructor();
		new Constructor(5);
		new Constructor(15);
		new Constructor(15.23);
	}

}
