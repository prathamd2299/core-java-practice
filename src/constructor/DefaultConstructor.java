package constructor;

public class DefaultConstructor {
	int a;
	boolean b;

	public static void main(String[] args) {
		// A default constructor is called
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("Default Value:");
		System.out.println("a = " + dc.a);
		System.out.println("b = " + dc.b);
	}
}
