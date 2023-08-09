package com.facebook.www;

import java.util.*;

public class Lhs {

	public static void main(String[] args) {
		 LinkedHashSet<String> str = new LinkedHashSet<String>();

	        // Using add() method
	        str.add("Pratham");
	        str.add("Anant");
	        str.add("Yash");
	        str.add("Sharad");
	        System.out.println("LinkedHashSet: " + str);
	        
	        System.out.println(str.size()); //printing size of linkedhashset
	        System.out.println(); //new line
	        str.add("Aniket"); //it insert value at end
	        System.out.println(str);
	        System.out.println(); //new line
	       for(String s : str)
	       {
	    	   System.out.print(s + " ");
	       }
	       System.out.println(); //new line
	       str.remove("Sharad"); //removes the sharad value
	       System.out.println(str);
	       System.out.println(); //new line
	       System.out.println(str.contains("Yash")); //check value is exist in linkedhashset or not
	       System.out.println(); //new line
	       str.clear();
	       System.out.println(str);
	       
	}
		
}
    


