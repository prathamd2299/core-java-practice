package stringop;

public class EqualsIgnoreCaseOfStrings {

	public static void main(String[] args) {
		String str = new String("prathamesh");
		String str1 = new String("prathamesh");
		String str2 = new String("Prathamesh");
		String str3 = new String("PRATHAMESH");
		System.out.println(str.equalsIgnoreCase(str1)); //checking two strings are equal or not without uppercase and lowercase checking  
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str3));

	}

}
