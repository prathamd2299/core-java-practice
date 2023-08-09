package hashsetcollection;

import java.util.HashSet;

public class CollectionHashSet {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("Pratham");
		s.add("Anant");
		s.add("Yash");
		s.add("Sharad");

		System.out.println(s); // printing hashset values
		System.out.println(); // new line

		System.out.println(s.size()); // printing size of hashset
		System.out.println(); // new line

		System.out.println(s.remove("Yash")); // removing value of Yash
		System.out.println(); // new line

		// printing values using for each loop
		for (String str : s) {
			System.out.print(str + " ");
		}
		System.out.println("\n"); // new line

		System.out.println(s.contains("Sharad")); // checking value exist or not
		System.out.println(); // new line

		s.clear();

	}
}