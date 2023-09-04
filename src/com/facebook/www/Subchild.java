package com.facebook.www; //multilevel inheritance

import inheritance.Child;

public class Subchild extends Child {
	public void saving() {
		System.out.println("saving");
	}

	public static void main(String[] args) {
		Subchild obj1 = new Subchild();
		obj1.money();
		obj1.property();
	}

}
