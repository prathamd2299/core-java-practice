package stringop;

public class StartsWithIndexString {

	public static void main(String[] args) {
		String str = new String("Cricket");
		System.out.println(str.startsWith("ket"));
		System.out.println(str.startsWith("crick"));
		System.out.println(str.startsWith("Cric"));
	}

}
