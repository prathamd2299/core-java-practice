package constructor;

public class ParameterizedConstructor {
	String languages;

	// constructor accepting single value
	ParameterizedConstructor(String lang) {
		languages = lang;
		System.out.println(languages + " Programming Language");
	}

	public static void main(String[] args) {
		// call constructor by passing a single value
		/*
		 * ParameterizedConstructor pc = new ParameterizedConstructor("Java");
		 * ParameterizedConstructor pc1 = new ParameterizedConstructor("Python");
		 * ParameterizedConstructor pc2 = new ParameterizedConstructor("C");
		 */

		new ParameterizedConstructor("Java");
		new ParameterizedConstructor("Python");
		new ParameterizedConstructor("C");
	}

}
