package stringop;

public class TrimString {

	public static void main(String[] args) {
		String str1 = "     Learn   Java Programming ";
		String str2 = "Learn\nJava Programming\n\n   ";
		System.out.println(str1.trim());
		System.out.println(str2.trim()); // removes starting and ending white spaces from string

	}

}
