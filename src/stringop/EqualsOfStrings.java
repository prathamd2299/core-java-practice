package stringop;

public class EqualsOfStrings {

	public static void main(String[] args) {
		String str = new String("prathamesh");
		String str1 = new String("prathamesh");
		String str2 = new String("Prathamesh");
		String str3 = new String("PRATHAMESH");
		System.out.println(str.equals(str1)); // checking two strings are equal or not with uppercase and lowercase
												// checking
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	}

}
