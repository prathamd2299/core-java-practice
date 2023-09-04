package com.facebook.www;

public class VariableType {
	int x = 45; // instance variable

	public void M1() {
		int a = 20; // local variable
		System.out.println(a);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableType obj = new VariableType();
		obj.M1();
		System.out.println(obj.x);
	}

}
