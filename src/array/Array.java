package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*************************
		 * integer array
		 *******************************************/
		int a[] = { 10, 20, 30, 40 }; // declaring array of int data type
		System.out.println(a.length); // printing array size
		System.out.println(a[2]); // printing array element at index 2
//		System.out.println(a[4]); //ArrayOutOfBoundsException
		System.out.println(Arrays.toString(a)); // printing array of int data type
		a[2] = 600; // changing value of existing array at index 2
		System.out.println(Arrays.toString(a)); // printing array of int data type

		try {
			a[4] = 700; // changing array value at index 4
			System.out.println(Arrays.toString(a)); // printing array of int data type
		} catch (Exception e) {
			System.out.println("I am in catch block"); // handling exception
		}

		// printing array by using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// printing array by using for each loop
		for (int i : a) {
			System.out.print(i + " ");
		}

		/*************************
		 * String array
		 *******************************************/
		System.out.println("\n"); // for new line
		String[] s = { "anant", "prathamesh", "sharad", "swapnil" }; // declaring string array

		System.out.println(Arrays.toString(s)); // printing string array
		System.out.println(s.length); // printing array size
		s[1] = "aniket"; // changing value at index 1
		System.out.println(Arrays.toString(s)); // printing changing array

		// printing array by using for loop
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " "); // printing array by using for loop
		}

		System.out.println(); // for new line
		// printing array by using for each loop
		for (String str : s) {
			System.out.print(str + " ");
		}
		/*************************
		 * double array
		 *******************************************/
		System.out.println("\n"); // for new line
		double[] d = new double[5]; // declaring double array by using new keyword
		d[0] = 10.2; // initializing array values at index 0
		d[1] = 35.4; // initializing array values at index 1
		d[2] = 45.2; // initializing array values at index 2
		d[3] = 75.6; // initializing array values at index 3
		d[4] = 24.96; // initializing array values at index 4
		System.out.println(d.length);
		System.out.println(Arrays.toString(d)); // printing double data type array
		d[3] = 95.64; // changing double array value at index 3
		System.out.println(Arrays.toString(d)); // printing double array after change

		// printing double array by using for loop
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

		System.out.println(); // for new line
		// printing double array by using for each loop
		for (double dob : d) {
			System.out.print(dob + " ");
		}
		System.out.println("\n"); // for new line
		/*************************
		 * character array
		 *******************************************/
		char c[] = { 'c', 'r', 'i', 'c', 'k', 'e', 't' }; // declaring char array
		System.out.println(Arrays.toString(c)); // printing char array
		System.out.println(c.length); // printing length of char array

		c[5] = 'a'; // changing double array value at index 5
		System.out.println(Arrays.toString(c)); // printing double array after change

		// printing char array by using for loop
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println(); // for new line
		// printing char array by using for each loop
		for (char ch : c) {
			System.out.print(ch + " ");
		}

	}

}
