package com.facebook.www; //multilevel inheritance

public class Child extends Parent {
	public void money()
	{
		System.out.println("Cars");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.property();
	}
}
