package arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
/***************** Integer Arraylist ****************************************/
		System.out.println("-> Integer ArrayList: \n");
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		// printing arraylist values
		System.out.println(obj); 
		System.out.println(); //new line
		
		//printing arraylist using for loop
		for(int i = 0; i < obj.size(); i++)
		{
			System.out.print(obj.get(i) + " ");
		}
		System.out.println("\n"); //new line
		
		//printing arraylist using for each loop
		for(int a : obj)
		{
			System.out.print(a + " ");
		}
		System.out.println("\n"); //new line
		
		//printing length of an arraylist
		System.out.println("Size of an arraylist is: " + obj.size()); 
		System.out.println(); //new line
		
		//printing values at index 2
		System.out.println("Value at index 2 is: " + obj.get(2)); 
		System.out.println(); //new line
		
		//removing value at index 2 and printing remaining values
		obj.remove(2); 
		System.out.println("New arraylist after removing \nvalue at index 2 is: " + obj);
		System.out.println(); //new line
		
		//inserting value at index 1 
		//but not replace the value at index 1,
		//just shifting old value to right side.
		obj.add(1, 60); 
		
		//inserting value at end 
		obj.add(56);
		
		//printing new arraylist
		System.out.println("New arraylist \nafter inserting new value: " + obj);
		System.out.println(); //new line
		
		//replace the value at specific given index i.e. 2
		obj.set(2, 78);
		System.out.println(obj);
		System.out.println(); //new line
		
		//contains means exist in arraylist or not checking
		System.out.println(obj.contains(8));
		System.out.println(); //new line
		
		//remove all the values
		obj.clear();
		
		System.out.println("After clearing all the values: " + obj);
		
/************************ String ArrayList **********************************/
		System.out.println("\n-> Double Arraylist: \n");
		ArrayList<Double> value = new ArrayList<Double>();
		value.add(43.12);
		value.add(46.85);
		value.add(95.14);
		value.add(76.48);
		
		// printing arraylist values
		System.out.println(value); 
		System.out.println(); //new line
		
		//printing arraylist using for loop
		for(int i = 0; i < value.size(); i++)
		{
			System.out.print(value.get(i) + " ");
		}
		System.out.println("\n"); //new line
		
		//printing arraylist using for each loop
		for(Double d : value)
		{
			System.out.print(d + " ");
		}
		System.out.println("\n"); //new line
		
		//printing length of an arraylist
		System.out.println("Size of an arraylist is: " + value.size()); 
		System.out.println(); //new line
		
		//printing values at index 2
		System.out.println("Value at index 2 is: " + value.get(2)); 
		System.out.println(); //new line
				
		//removing value at index 2 and printing remaining values
        value.remove(2); 
		System.out.println("New arraylist after removing \nvalue at index 2 is: " + value);
		System.out.println(); //new line
		
		//inserting value at index 1 
		//but not replace the value at index 1,
		//just shifting old value to right side.
        value.add(1, 60.87); 
				
		//inserting value at end 
		value.add(29.46);
				
		//printing new arraylist
		System.out.println("New arraylist \nafter inserting new value: " + value);
		System.out.println(); //new line
				
		//replace the value at specific given index i.e. 2
		value.set(2, 15.55);
		System.out.println(value);
		System.out.println(); //new line
				
		//contains means exist in arraylist or not checking
		System.out.println(value.contains(60.87));
		System.out.println(); //new line
				
		//remove all the values
		value.clear();
				
		System.out.println("After clearing all the values: " + obj);
	}

}
