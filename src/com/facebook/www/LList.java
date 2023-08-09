package com.facebook.www;

import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		LinkedList <Integer> obj = new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(30);
		
		System.out.println(obj);
		
		obj.add(55);
		
		System.out.println(obj);
		
		obj.add(2, 68);
		
		System.out.println(obj);
		
		obj.set(3, 75);
		
		System.out.println(obj);
		
		obj.remove(5);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.get(1));
		
		for(int i = 0; i < obj.size(); i++)
		{
			System.out.print(obj.get(i) + " ");
		}
		System.out.println();
		for(Integer i : obj)
		{
			System.out.print(i + " ");
		}
		
		obj.clear();
		System.out.println();
		System.out.println(obj);
	}

}
